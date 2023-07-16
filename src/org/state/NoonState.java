package org.state;

/**
 * 中午
 */
public class NoonState extends State {
    @Override
    public void writeProgrammer(Work work) {
        if (work.getHour() < 13) {
            System.out.printf("当前时间 %s 饿了，午饭：犯困，午休\n", work.getHour());
        } else {
            work.setState(new AfternoonState());
            work.writeProgrammer();
        }

    }
}
