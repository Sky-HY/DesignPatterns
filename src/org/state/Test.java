package org.state;

public class Test {
    public static void main(String[] args) {
        Work work = new Work();

        work.setHour(9);
        work.writeProgrammer();

        work.setHour(12);
        work.writeProgrammer();

        work.setHour(15);
        work.writeProgrammer();

        work.setHour(17);
        work.writeProgrammer();
        // work.setFinish(true);
        work.setHour(19);
        work.writeProgrammer();
        work.setHour(21);
        work.writeProgrammer();

        work.setHour(23);
        work.writeProgrammer();
    }
}
