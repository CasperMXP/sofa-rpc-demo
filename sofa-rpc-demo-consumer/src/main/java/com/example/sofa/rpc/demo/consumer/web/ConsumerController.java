package com.example.sofa.rpc.demo.consumer.web;

import com.alipay.sofa.rpc.api.GenericService;
import com.alipay.sofa.rpc.api.future.SofaResponseFuture;
import com.example.sofa.rpc.demo.api.service.ICallbackService;
import com.example.sofa.rpc.demo.api.service.IFutureService;
import com.example.sofa.rpc.demo.api.service.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Slf4j
@RestController
public class ConsumerController {

    @Resource
    IHelloService helloService;

    @Resource
    IFutureService futureService;

    @Resource
    ICallbackService callbackService;

    @Resource
    GenericService genericService;

    @RequestMapping("/hello/{message}")
    public String hello(@PathVariable("message") String message){
        return helloService.hello(message);
    }

    @RequestMapping("/future/{message}")
    public String future(@PathVariable("message") String message){
        String response = futureService.future(message);
        String result = "";
        try {
            result = (String) SofaResponseFuture.getResponse(3000, true);
            log.info("异步结果:{}",result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/callback/{message}")
    public String callback(@PathVariable("message") String message){
        return callbackService.callback(message);
    }

    @RequestMapping("/generic/{message}")
    public String generic(@PathVariable("message") String message){
        String str =(String) genericService.$invoke("generic",
                new String[]{"java.lang.String"},new Object[]{message});
        return str;
    }

}
