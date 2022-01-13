package com.zdc.ywabwechatserivce;

import com.zdc.ywabwechatserivce.service.impl.MiniProgramLoginImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YwabWechatSerivceApplicationTests {

    @Autowired
    MiniProgramLoginImpl miniProgramLogin;

    @Test
    void contextLoads() {
        miniProgramLogin.getSessionId("123");
    }

}
