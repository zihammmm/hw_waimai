package sample.UI;

import sample.Output.OutputUtils;
import sample.User.Maintainer;
import sample.User.Merchant;
import sample.User.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UIUtils {
    public static void waitOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
