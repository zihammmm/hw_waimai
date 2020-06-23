package sample.Output;

import sample.Input.SystemInput;

public class SystemOutput implements Output{
    private static SystemOutput systemOutput = null;
    private SystemOutput() {

    }

    public static SystemOutput getInstance() {
        if (systemOutput == null) {
            synchronized (SystemOutput.class) {
                if (systemOutput == null) {
                    systemOutput = new SystemOutput();
                }
            }
        }
        return systemOutput;
    }

    @Override
    public void outputln(String str) {
        System.out.println(str);

    }

    @Override
    public void output(String str) {
        System.out.print(str);
    }
}
