package attacks;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    public Amnesia() { super(Type.PSYCHIC, 0, 0);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 2));
    }

    @Override
    protected String describe() {
        return "применил атаку Amnesia! Специальная защита увеличена на 2";
    }
}
