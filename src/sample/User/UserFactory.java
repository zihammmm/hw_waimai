package sample.User;

import com.sun.istack.internal.NotNull;
import sample.User.VIP.VipOne;

public class UserFactory {
    public static User getUser(@NotNull UserType userType, int id, String name) {
        if (userType == UserType.customer) {
            return new Customer(id, name, new VipOne());
        }else if (userType == UserType.merchant) {
            return new Merchant(id, name);
        }else if (userType == UserType.maintainer) {
            return new Maintainer(id, name);
        }else {
            return null;
        }
    }
}
