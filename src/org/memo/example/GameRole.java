package org.memo.example;

public class GameRole {
    // 生命值
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    public void stateDisplay() {
        System.out.println("当前角色状态：");
        System.out.println("体力：" + vit);
        System.out.println("攻击力：" + atk);
        System.out.println("防御力：" + def);
    }
    // 获得初始状态
    public void initState() {
        vit = 100;
        atk = 100;
        def = 100;
    }
    // 战斗
    public void fight() {
        vit = 0;
        atk = 0;
        def = 0;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
