package sample.UI;

import sample.Output.OutputUtils;
import sample.User.Maintainer;

public class MaintainerUI {
    private Maintainer maintainer;

    public MaintainerUI(Maintainer maintainer) {
        this.maintainer = maintainer;

        mainUI();
    }

    public void mainUI() {
        OutputUtils.outputln("欢迎维护人员：" + maintainer.getName());
        OutputUtils.outputln("请选择操作：");
        OutputUtils.outputln("1.查看");
        OutputUtils.outputln("2.");
        OutputUtils.outputln("3.退出");
    }


}
