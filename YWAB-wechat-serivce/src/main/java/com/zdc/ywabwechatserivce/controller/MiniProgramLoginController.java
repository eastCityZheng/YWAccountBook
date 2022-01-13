package com.zdc.ywabwechatserivce.controller;

import com.zdc.ywab.common.api.CommonResult;
import com.zdc.ywabwechatserivce.service.impl.MiniProgramLoginImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 小程序登陆态
 *
 * @author dczheng
 * @date 2021年12月31日
 */
@Controller
@Tag(name = "小程序登陆")
@RequestMapping("/miniProgramLogin")
public class MiniProgramLoginController {

    @Autowired
    private MiniProgramLoginImpl miniProgramLogin;

    @Operation(summary = "调用WeChat API 获取session")
    @Parameters({
            @Parameter(name = "agentCode", description = "客户端返回的code", required = true)
    })
    @RequestMapping(value = "/getSession", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> getSession(@RequestParam(value = "agentCode") String agentCode) {
        return null;
    }
}
