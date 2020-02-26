package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ForeignWxPay
 * @author: wuwb
 * @date: 2020/2/26 16:56
 */
public class ForeignWxPay implements IWxPay {
    @Override
    public void pay() {
        System.out.println("境外微信支付");
    }
}
