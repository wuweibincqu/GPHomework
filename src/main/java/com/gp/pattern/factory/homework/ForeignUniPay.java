package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ForeignUniPay
 * @author: wuwb
 * @date: 2020/2/26 16:57
 */
public class ForeignUniPay implements IUniPay {
    @Override
    public void pay() {
        System.out.println("境外银联支付");
    }
}
