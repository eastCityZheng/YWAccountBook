package com.zdc.ywabwechatserivce.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdc.ywabwechatserivce.domain.WeChatProperties;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Objects;

/**
 * @author dczheng
 * @date 2022年01月04日
 */
@Component
@Slf4j
public class HttpUtil {

    private static OkHttpClient client = new OkHttpClient();
    private static WeChatProperties weChatPropertiesStatic;

    @Autowired
    WeChatProperties weChatProperties;

    @PostConstruct
    public void init() {
        weChatPropertiesStatic = weChatProperties;
    }

    public static JSONObject requestSessionIdHttp(String agentCode) {
        String url = weChatPropertiesStatic.getUrl()
                .replace("APPID",weChatPropertiesStatic.getAppId())
                .replace("SECRET",weChatPropertiesStatic.getAppSecret())
                .replace("JSCODE",agentCode);
        String jsonString = doGetRequest(url);
        if(StringUtils.hasText(jsonString)){
            return JSON.parseObject(jsonString);
        }
        return null;
    }

    private static String doGetRequest(String url) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        } catch (IOException e) {
            log.error("call http error",e);
        }
        return "";
    }
}