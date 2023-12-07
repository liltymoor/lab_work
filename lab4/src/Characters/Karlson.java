package Characters;
import CreaturesLogic.Human;
import TranslatorClass.Translator;

import java.util.Date;

public class Karlson extends Human {
    public Karlson(int givenAge, Date givenDateBirth) {
        super(givenAge, (Translator.isEnglish) ? "Characters.Karlson" : "Карлсон", givenDateBirth);
    }

    void flyWithPropeller() {
        System.out.println("Flying...");
    }
}
