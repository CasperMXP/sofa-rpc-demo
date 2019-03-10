package com.example.sofa.rpc.demo.provider.service;

import com.example.sofa.rpc.demo.api.service.IFutureService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FutureServiceImpl implements IFutureService {

    @Override
    public String future(String message) {
        log.info("收到消息:{}",message);
        return "future "+ message;
    }
}
