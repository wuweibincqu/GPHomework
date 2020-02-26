package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ChinaWxPay
 * @author: wuwb
 * @date: 2020/2/26 16:53
 */
public class ChinaWxPay implements IWxPay {
    @Override
    public void pay() {
        System.out.println("国内微信支付");
    }
}
