package sample.User;

public class Maintainer implements User{
    private int id;
    private String name;

    Maintainer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getSaleOneWeek() {
        return 0;
    }

    public double getSaleOneMonth() {
        return 0;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
