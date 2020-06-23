package sample.Input;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemInput implements Input{
    private static SystemInput systemInput = null;
    private static Scanner scanner;

    private SystemInput() {

    }

    public static SystemInput getInstance() {
        if (systemInput == null) {
            synchronized (SystemInput.class) {
                if (systemInput == null) {
                    systemInput = new SystemInput();
                    scanner = new Scanner(System.in);
                }
            }
        }
        return systemInput;
    }

    @Override
    public String inputVChar() {
        if (scanner.hasNext()) {
            return scanner.next();
        }else {
            return "";
        }
    }

    @Override
    public double inputDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }else {
            Logger.getAnonymousLogger().log(Level.WARNING, "输入的不是浮点数");
            return 0.0;
        }
    }

    @Override
    public int inputInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else {
            Logger.getAnonymousLogger().log(Level.WARNING, "输入的不是整型数");
            return 0;
        }
    }
}
