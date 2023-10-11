package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderShock extends SpecialMove {
    private static final double power = 40;
    private static final double accuracy = 100;
    public ThunderShock() { super(Type.ELECTRIC, power, accuracy);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (new Effect().chance(0.1).success())
            Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return "применил атаку Thunder Shock! Противник может быть парализован";
    }
}
