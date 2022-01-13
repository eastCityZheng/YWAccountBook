package com.zdc.ywabwechatserivce.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zdc.ywabwechatserivce.service.MiniProgramLoginService;
import com.zdc.ywabwechatserivce.util.HttpUtil;
import org.springframework.stereotype.Service;

/**
 * @author dczheng
 * @date 2021年12月31日
 */
@Service
public class MiniProgramLoginImpl implements MiniProgramLoginService {

    private static String OPENID = "openid";
    private static String SESSION_KEY = "session_key";


    @Override
    public String getSessionId(String agentCode) {
        JSONObject jsonObject = HttpUtil.requestSessionIdHttp(agentCode);
        if (jsonObject == null){
            return null;
        }
        //WeChat api 未返回正确结果
        if (!jsonObject.containsKey(OPENID) || !jsonObject.containsKey(SESSION_KEY)){
            return null;
        }



        return null;
    }
}
