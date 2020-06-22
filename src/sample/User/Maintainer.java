package sample.User;

public class Maintainer extends User{
    Maintainer(int id, String name) {
        super(id, name);
    }

    public double getSaleOneWeek() {
        return 0;
    }

    public double getSaleOneMonth() {
        return 0;
    }
}
