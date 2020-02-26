package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ChinaPayFactory
 * @author: wuwb
 * @date: 2020/2/26 16:50
 */
public class ChinaPayFactory extends AbstractPayFactory {
    @Override
    protected IAliPay createAliPay() {
        super.init();
        return new ChinaAliPay();
    }

    @Override
    protected IWxPay createWxPay() {
        super.init();
        return new ChinaWxPay();
    }

    @Override
    protected IUniPay createUniPay() {
        super.init();
        return new ChinaUniPay();
    }
}
