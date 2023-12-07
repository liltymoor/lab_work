package Characters;

import CreaturesLogic.Creature;

public class IA extends Creature implements ICharacter {

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    protected String getName() {
        return "Осел ИА";
    }
}
