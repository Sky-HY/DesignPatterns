package org.state;

/**
 * 下午
 */
public class AfternoonState extends State {
    @Override
    public void writeProgrammer(Work work) {
        if (work.getHour() < 18) {
            System.out.printf("当前时间 %s 下午状态还不错，继续努力\n", work.getHour());
        } else {
            work.setState(new EveningState());
            work.writeProgrammer();
        }
    }
}
