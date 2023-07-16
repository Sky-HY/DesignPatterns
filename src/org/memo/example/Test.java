package org.memo.example;

/**
 * 不使用设计模式的备份
 */
public class Test {
    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.initState();
        lixiaoyao.stateDisplay();

        // 备份
        GameRole bak = new GameRole();
        // 备份规则如果有修改的话，那这里就要修改
        bak.setVit(lixiaoyao.getVit());
        bak.setAtk(lixiaoyao.getAtk());
        bak.setDef(lixiaoyao.getDef());

        lixiaoyao.fight();

        // 恢复备份
        lixiaoyao.setVit(bak.getVit());
        lixiaoyao.setAtk(bak.getAtk());
        lixiaoyao.setDef(bak.getDef());

        lixiaoyao.stateDisplay();

    }
}
