package com.darren.demo.manager;

import com.darren.demo.domain.SendSmsCodeRequest;
import com.darren.demo.domain.SendSmsCodeResponse;

/**
 * @author JiangDarun
 * @Time 2019/1/2.
 */
public interface SmsCodeApiService {


    SendSmsCodeResponse getUserLoginSmsCode(SendSmsCodeRequest request);
}
