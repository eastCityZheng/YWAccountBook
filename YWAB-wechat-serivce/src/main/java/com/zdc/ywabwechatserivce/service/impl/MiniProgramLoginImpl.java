package com.zdc.ywabwechatserivce.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zdc.ywabwechatserivce.service.MiniProgramLoginService;
import com.zdc.ywabwechatserivce.util.HttpUtil;

/**
 * @author dczheng
 * @date 2021年12月31日
 */
public class MiniProgramLoginImpl implements MiniProgramLoginService {
    @Override
    public String getSessionId(String agentCode) {
        JSONObject jsonObject = HttpUtil.requestSessionIdHttp(agentCode);
        if (jsonObject == null){
            return null;
        }



        return null;
    }
}
