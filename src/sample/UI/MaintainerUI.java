package sample.UI;

import sample.Input.InputUtils;
import sample.Output.OutputUtils;
import sample.User.Maintainer;

public class MaintainerUI {
    private Maintainer maintainer;
    private static final int LOGOUT = 3;

    public MaintainerUI(Maintainer maintainer) {
        this.maintainer = maintainer;

        mainUI();
    }

    public void mainUI() {
        do {
            OutputUtils.clear();
            options();
        }while (chooseOptions() != LOGOUT);
    }

    public int chooseOptions() {
        int x = InputUtils.inputInt();
        switch (x) {
            //TODO: 选项

        }
        return x;
    }

    public void options() {
        OutputUtils.outputln("欢迎维护人员：" + maintainer.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看");
        OutputUtils.outputln("2.");
        OutputUtils.outputln("3.退出");
    }


}
