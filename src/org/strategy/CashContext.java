package org.strategy;

public class CashContext {
    private CashContext() {

    }

    public static double getResult(String type, double money) {
        CashSuper cash;
        switch (type) {
            case "正常收费":
                cash = new CashNormal();
                break;
            case "打八折":
                cash = new CashRebate(0.8d);
                break;
            case "满100减10":
                cash = new CashReturn(100d, 10d);
                break;
            default:
                throw new IllegalArgumentException(type);
        }
        return cash.acceptCash(money);
    }
}
