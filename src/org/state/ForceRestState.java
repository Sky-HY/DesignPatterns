package org.state;

/**
 * 20点强制下班
 */
public class ForceRestState extends State{
    @Override
    public void writeProgrammer(Work work) {
        System.out.printf("当前时间 %s 超过20点了，强制下班\n", work.getHour());
    }
}
