package com.wusd.framework.aop.interceptor;

import com.wusd.framework.aop.invocation.MethodInvocation;

/**
 * 切面拦截器
 */
public interface AopMethodInterceptor {
    //拦截器通过请求方法调用,在方法执行前后做一些处理
    Object invoke(MethodInvocation mi) throws Throwable;
}
