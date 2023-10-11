package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
    private static final double power = 110;
    private static final double accuracy = 70;
    public Blizzard() { super(Type.ICE, power, accuracy);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (new Effect().chance(0.1).success())
            Effect.freeze(pokemon);
    }

    @Override
    protected String describe() {
        return "применил атаку Blizzard! Противник может быть заморожен";
    }
}