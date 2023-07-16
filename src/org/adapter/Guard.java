package org.adapter;

/**
 * 后卫
 */
public class Guard extends Player {
    public Guard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("后卫 %s 进攻%n", name);
    }

    @Override
    public void defense() {
        System.out.printf("后卫 %s 防守%n", name);
    }
}
