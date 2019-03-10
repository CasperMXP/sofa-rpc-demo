package com.example.sofa.rpc.demo.provider.service;

import com.example.sofa.rpc.demo.api.service.IHelloService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello(String message) {
        log.info("收到消息:{}",message);
        return "hello "+ message;
    }
}
