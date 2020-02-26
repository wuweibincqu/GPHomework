package com.gp.pattern.factory.homework;

/**
 * @Description 支付抽象工厂
 * @Package: com.gp.pattern.factory.homework
 * @ClassName AbstractPayFactory
 * @author: wuwb
 * @date: 2020/2/26 16:28
 */
public abstract class AbstractPayFactory {

    public void init(){
        System.out.println("初始化基础数据");
    }

    protected abstract IAliPay createAliPay();

    protected abstract IWxPay createWxPay();

    protected abstract IUniPay createUniPay();
}
