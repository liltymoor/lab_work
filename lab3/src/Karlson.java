import java.util.Date;

public class Karlson extends Human{
    Karlson(int givenAge, Date givenDateBirth) {
        super(givenAge, (Translator.isEnglish) ? "Karlson" : "Карлсон", givenDateBirth);
    }

    void flyWithPropeller() {
        System.out.println("Flying...");
    }
}
