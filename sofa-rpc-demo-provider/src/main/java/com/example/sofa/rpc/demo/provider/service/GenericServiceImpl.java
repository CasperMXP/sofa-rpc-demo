package com.example.sofa.rpc.demo.provider.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericServiceImpl implements IGenericService {

    public String generic(String message) {
        log.info("收到消息:{}",message);
        return "generic "+ message;
    }
}
