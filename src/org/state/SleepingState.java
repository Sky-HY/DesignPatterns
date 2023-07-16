package org.state;

/**
 * 深夜
 */
public class SleepingState extends State{
    @Override
    public void writeProgrammer(Work work) {
        System.out.printf("当前时间 %s 不行了，睡着了\n", work.getHour());
    }
}
