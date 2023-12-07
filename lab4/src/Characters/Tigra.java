package Characters;

import CreaturesLogic.Creature;
import TranslatorClass.Translator;

public class Tigra extends Creature implements ICharacter {
    @Override
    protected String getName() {
        return Translator.isEnglish ? "Tigra" : "Тигра";
    }
}
