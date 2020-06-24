package sample.Output;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputUtilsTest {

    @Test
    void outputln() {
        OutputUtils.outputln("测试带换行符的");
        OutputUtils.outputln("12345566");
        OutputUtils.outputln("676567576");
    }

    @Test
    void output() {
        OutputUtils.output("测试不带换行符的");
        OutputUtils.output("12345566jjj");
        OutputUtils.output("676567576");
    }

    @Test
    void clear() {
        OutputUtils.outputln("12345566");
        OutputUtils.outputln("676567576");
        OutputUtils.outputln("12345566");
        OutputUtils.outputln("676567576");
        OutputUtils.clear();
        OutputUtils.outputln("clear over");
        OutputUtils.outputln("done");
    }
}