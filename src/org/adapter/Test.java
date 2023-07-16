package org.adapter;

public class Test {
    public static void main(String[] args) {
        Forwards forwards = new Forwards("张三");
        forwards.attack();
        forwards.defense();

        Center center = new Center("李四");
        center.attack();
        center.defense();

        Guard guard = new Guard("王五");
        guard.attack();
        guard.defense();

        Forwards 姚明 = new Forwards("姚明");
        姚明.attack();
        姚明.defense();
    }
}
