package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ChinaAliPay
 * @author: wuwb
 * @date: 2020/2/26 16:52
 */
public class ChinaAliPay implements IAliPay {
    @Override
    public void pay() {
        System.out.println("国内支付宝支付");
    }
}
