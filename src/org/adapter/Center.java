package org.adapter;

/**
 * 中锋
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("中锋 %s 进攻%n", name);
    }

    @Override
    public void defense() {
        System.out.printf("中锋 %s 防守%n", name);
    }
}
