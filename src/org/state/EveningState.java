package org.state;

/**
 * 晚上
 */
public class EveningState extends State {
    @Override
    public void writeProgrammer(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgrammer();
        } else {
            if (work.getHour() < 20) {
                System.out.printf("当前时间 %s 加班哦，劳累之极\n", work.getHour());
            } else {
                work.setState(new SleepingState());
                work.writeProgrammer();
            }
        }
    }
}
