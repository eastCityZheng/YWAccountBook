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
@PropertySource(value = {"classpath:wechat.yml"})
@ConfigurationProperties(prefix = "wechat")
public class WeChatProperties {

    public String url;
    public String appId;
    public String appSecret;
}
