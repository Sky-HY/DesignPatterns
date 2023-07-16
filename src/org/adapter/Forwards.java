package org.adapter;

/**
 * 前锋
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("前锋 %s 进攻%n", name);
    }

    @Override
    public void defense() {
        System.out.printf("前锋 %s 防守%n", name);
    }
}
