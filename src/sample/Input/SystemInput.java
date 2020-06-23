package sample.Input;

import sample.Output.SystemOutput;

public class SystemInput implements Input{
    private static SystemInput systemInput = null;
    private SystemInput() {

    }

    public static SystemInput getInstance() {
        if (systemInput == null) {
            synchronized (SystemInput.class) {
                if (systemInput == null) {
                    systemInput = new SystemInput();
                }
            }
        }
        return systemInput;
    }

    @Override
    public void input() {

    }
}
