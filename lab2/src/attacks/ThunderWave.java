package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {
    private static final double power = 0;
    private static final double accuracy = 90;
    public ThunderWave() { super(Type.ELECTRIC, power, accuracy);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return "применил атаку Thunder Wave! Противник парализован";
    }
}
