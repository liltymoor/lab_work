package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonBreath extends SpecialMove {
    private static final double power = 60;
    private static final double accuracy = 100;
    public DragonBreath() { super(Type.DRAGON, power, accuracy);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (new Effect().chance(0.3).success())
            Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return "применил атаку Dragon Breath! Противник может быть парализован";
    }
}