package com.wusd.framework.aop.core;

public interface AopProxy {
    Object getProxy();
    Object getProxy(ClassLoader classLoader);
}
