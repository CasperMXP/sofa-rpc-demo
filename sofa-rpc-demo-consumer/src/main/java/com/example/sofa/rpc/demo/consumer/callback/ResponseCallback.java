package com.example.sofa.rpc.demo.consumer.callback;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.invoke.SofaResponseCallback;
import com.alipay.sofa.rpc.core.request.RequestBase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResponseCallback implements SofaResponseCallback {

    @Override
    public void onAppResponse(Object appResponse, String methodName, RequestBase request) {
        log.info("onAppResponse:{},{},{}",appResponse,methodName,request);
    }

    @Override
    public void onAppException(Throwable throwable, String methodName, RequestBase request) {

    }

    @Override
    public void onSofaException(SofaRpcException sofaException, String methodName, RequestBase request) {

    }
}
