package com.gp.pattern.factory.homework;

/**
 * @Description TODO
 * @Package: com.gp.pattern.factory.homework
 * @ClassName TestAbstractFactory
 * @author: wuwb
 * @date: 2020/2/26 17:01
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        ChinaPayFactory cpf = new ChinaPayFactory();
        cpf.createAliPay().pay();
        cpf.createWxPay().pay();
        cpf.createUniPay().pay();

        ForeignPayFactory fpf = new ForeignPayFactory();
        fpf.createAliPay().pay();
        fpf.createWxPay().pay();
        fpf.createUniPay().pay();
    }
}
