package org.strategy;

/**
 * 正常收费算法
 */
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
