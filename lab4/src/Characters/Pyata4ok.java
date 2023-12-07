package Characters;

import CreaturesLogic.Creature;
import TranslatorClass.Translator;

public class Pyata4ok extends Creature implements ICharacter {
    @Override
    protected String getName() {
        return Translator.isEnglish ? "Pyata4ok" : "Пятачок";
    }
}
