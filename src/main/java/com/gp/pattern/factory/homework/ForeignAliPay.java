package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ForeignAliPay
 * @author: wuwb
 * @date: 2020/2/26 16:55
 */
public class ForeignAliPay implements IAliPay {
    @Override
    public void pay() {
        System.out.println("境外支付宝支付");
    }
}
