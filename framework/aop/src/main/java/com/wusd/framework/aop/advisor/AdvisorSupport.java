package com.wusd.framework.aop.advisor;

import com.wusd.framework.aop.interceptor.AopMethodInterceptor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * 我们aop框架能够理解的数据结构, 问题就变成了--对于哪个目标,增加哪些拦截器.
 */
@Data
public class AdvisorSupport extends Advisor {
    //目标对象
    private TargetSource targetSource;

    private List<AopMethodInterceptor> list = new LinkedList<>();

    public void addAopMethodInterceptor(AopMethodInterceptor interceptor) {
        list.add(interceptor);
    }

    public void addAopMethodInterceptors(List<AopMethodInterceptor> interceptors) {
        list.addAll(interceptors);
    }
}