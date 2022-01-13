package com.zdc.ywabwechatserivce.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author dczheng
 * @date 2022年01月04日
 */

@Component
@Data
@ConfigurationProperties(prefix = "wechat")
@PropertySource(value = {"classpath:wechat.properties"})
public class WeChatProperties {

    public String url;
    public String appId;
    public String appSecret;
}
