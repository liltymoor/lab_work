package Characters;

import CreaturesLogic.Creature;
import TranslatorClass.Translator;

public class ChristopherRobin extends Creature implements ICharacter {
    @Override
    protected String getName() {
        return Translator.isEnglish ? "Christopher Robin" : "Кристофер Робин";
    }
}
