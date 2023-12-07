package CreaturesLogic;

import java.util.Date;

public abstract class Creature {
    int age;
    String name;
    Date dateBirth;
    protected abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

    public void sleep() {
        System.out.println( getName() + " is zZzZzZzZz...");
    };

}
