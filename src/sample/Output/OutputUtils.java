package sample.Output;

public class OutputUtils {
    private static Output output = SystemOutput.getInstance();

    public static void outputln(String str) {
        output.outputln(str);
    }

    public static void output(String str) {
        output.output(str);
    }
}
