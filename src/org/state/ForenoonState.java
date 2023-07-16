package org.state;

/**
 * 早上
 */
public class ForenoonState extends State {
    @Override
    public void writeProgrammer(Work work) {
        if (work.getHour() < 12) {
            System.out.printf("当前时间 %s 上午工作，精神百倍\n", work.getHour());
        } else {
            work.setState(new NoonState());
            work.writeProgrammer();
        }
    }
}
