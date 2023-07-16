package org.memo.example2;

/**
 * 备忘录模式
 */
public class Test {
    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.initState();
        lixiaoyao.stateDisplay();

        RoleStateMemento roleStateMemento = lixiaoyao.saveState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker(roleStateMemento);

        lixiaoyao.fight();

        lixiaoyao.recoveryState(caretaker.getRoleStateMemento());

        lixiaoyao.stateDisplay();
    }
}
