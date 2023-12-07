package Characters;

import CreaturesLogic.Creature;
import TranslatorClass.Translator;

public class Krolik extends Creature implements ICharacter {
    @Override
    protected String getName() {
        return Translator.isEnglish ? "Krolik" : "Кролик";
    }
}
