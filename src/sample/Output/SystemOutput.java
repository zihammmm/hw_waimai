package sample.Output;

import java.io.IOException;

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

    @Override
    public void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
