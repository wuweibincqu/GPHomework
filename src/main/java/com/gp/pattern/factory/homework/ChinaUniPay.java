package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ChinaUniPay
 * @author: wuwb
 * @date: 2020/2/26 16:54
 */
public class ChinaUniPay implements IUniPay {
    @Override
    public void pay() {
        System.out.println("国内银联支付");
    }
}
