package sample.Output;

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
}