package com.zdc.ywabwechatserivce.service;

/**
 * @author dczheng
 * @date 2021年12月31日
 */
public interface MiniProgramLoginService {

    /**
     * 调用wechat API 获取session_key 和 openId 生成sessionID
     * @author dczheng
     * @date 2021/12/31 4:58 下午
     * @param agentCode
     * @return java.lang.String
     */
    public String getSessionId(String agentCode);

}
