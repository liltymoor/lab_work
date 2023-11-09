import java.util.Date;

public abstract class Creature {
    int age;
    String name;
    Date dateBirth;
    abstract String getName();
    void sleep() {
        System.out.println( getName() + " is zZzZzZzZz...");
    };

}
