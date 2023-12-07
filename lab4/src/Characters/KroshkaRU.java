package Characters;

import CreaturesLogic.Creature;
import Exceptions.UnluckException;
import TranslatorClass.Translator;

import java.util.Random;

public class KroshkaRU extends Creature implements ICharacter {

    public static class UnluckMoves {
        static public String fallInRiver = Translator.isEnglish ? "Fall into River" : "Свалиться в реку";
        static public String fallOutOfCarWhileDriving = Translator.isEnglish ? "fall out of car while driving" : "Вывалиться из машины на ходу";
    }

    public String makeUnluckMove(String move) {
        if (new Random().nextBoolean())
            return "Повезло";
        else {
            throw new UnluckException(move);
        }
    };

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    protected String getName() {
        return "Крошка Ру";
    }
}
