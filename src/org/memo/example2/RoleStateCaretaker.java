package org.memo.example2;

public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateCaretaker(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }
}
