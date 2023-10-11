package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SacredFire extends PhysicalMove {
    private static final double power = 100;
    private static final double accuracy = 95;
    public SacredFire() { super(Type.FIRE, power, accuracy);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (new Effect().chance(0.5).success())
            Effect.burn(pokemon);
    }

    @Override
    protected String describe() {
        return "применил атаку Sacred Fire! Противник может загореться";
    }
}