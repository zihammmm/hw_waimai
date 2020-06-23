package sample.Input;

public class InputUtils {
    private static Input input = SystemInput.getInstance();

    public static String inputString() {
        return input.inputVChar();
    }

    public static int inputInt() {
        return input.inputInt();
    }

    public static double inputDouble() {
        return input.inputDouble();
    }
}
