package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName ForeignPayFactory
 * @author: wuwb
 * @date: 2020/2/26 16:55
 */
public class ForeignPayFactory extends AbstractPayFactory {
    @Override
    protected IAliPay createAliPay() {
        super.init();
        return new ForeignAliPay();
    }

    @Override
    protected IWxPay createWxPay() {
        super.init();
        return new ForeignWxPay();
    }

    @Override
    protected IUniPay createUniPay() {
        super.init();
        return new ForeignUniPay();
    }
}
