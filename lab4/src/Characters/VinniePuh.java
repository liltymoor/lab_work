package Characters;

import CreaturesLogic.Creature;
import TranslatorClass.Translator;

public class VinniePuh extends Creature implements ICharacter {
    @Override
    protected String getName() {
        return Translator.isEnglish ? "Vinnie Puh" : "Винни-Пух";
    }
}
