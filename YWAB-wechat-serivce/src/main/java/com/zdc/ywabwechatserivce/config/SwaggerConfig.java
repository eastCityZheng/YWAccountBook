package com.zdc.ywabwechatserivce.config;

import com.zdc.ywab.common.config.BaseSwaggerConfig;
import com.zdc.ywab.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author dczheng
 * @date 2022年01月12日
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zdc.ywabwechatserivce.controller")
                .title("永旺账簿小程序后台")
                .description("永旺账簿小程序相关接口文档")
                .contactName("zdc")
                .version("1.0")
//                .enableSecurity(true)
                .build();
    }
}
