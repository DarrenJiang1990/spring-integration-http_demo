package com.darren.demo.manager.impl;

import com.darren.demo.domain.SendSmsCodeRequest;
import com.darren.demo.domain.SendSmsCodeResponse;
import com.darren.demo.manager.SmsCodeApiService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 *
 * 短信验证码spring int集成
 * @author JiangDarun
 * @Time 2019/1/2.
 * 调用说明,以SendSmsCodeRequest为例
 * 本项目加入启动端口为8083，则前端的http调用访问方式为
 *  http://localhost:8083/service?channel=SendSmsCodeRequest&loginAccount=1709060003&platformId=2e2302818a996993c08f2f07c9606e79&appKey=mobile
 *  返回{"result":"验证码发送成功","code":"0000","smsCode":"udIP"}
 */

@Scope("singleton")
@Service("smsCodeApiService")
public class SmsCodeApiServiceImpl implements SmsCodeApiService {

  @Value("${system.code}")
  private  String  systemCode;

    /**
     * 发送验证码
     * @param request
     * @return
     */
    @Override
    public SendSmsCodeResponse getUserLoginSmsCode(SendSmsCodeRequest request) {
        SendSmsCodeResponse response=new SendSmsCodeResponse();
        String loginAccount=request.getLoginAccount();
        System.out.println("当前系统编号是:"+systemCode);
        if(StringUtils.isBlank(loginAccount)){
            response.setCode("9999");
            response.setResult("用户账号不能为空");
            return response;
        }
        String smsCode= RandomStringUtils.randomAlphabetic(4);
        response.setCode("0000");
        response.setResult("验证码发送成功");
        response.setSmsCode(smsCode);
        return response;
    }
}
