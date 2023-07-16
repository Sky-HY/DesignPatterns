package org.state;

/**
 * 下班
 */
public class RestState extends State {
    @Override
    public void writeProgrammer(Work work) {
        System.out.printf("当前时间 %s 下班回家了\n", work.getHour());
    }
}
