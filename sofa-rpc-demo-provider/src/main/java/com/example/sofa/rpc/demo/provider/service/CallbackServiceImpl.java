package com.example.sofa.rpc.demo.provider.service;

import com.example.sofa.rpc.demo.api.service.ICallbackService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallbackServiceImpl implements ICallbackService {

    @Override
    public String callback(String message) {
        log.info("收到消息:{}",message);
        return "callback "+ message;
    }
}
