package attacks;

import ru.ifmo.se.pokemon.*;

public class LightScreen extends StatusMove {
    private static final double power = 0;
    private static final double accuracy = 0;
    public LightScreen() { super(Type.PSYCHIC, power, accuracy);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(5).stat(Stat.SPECIAL_ATTACK, -3));
    }

    @Override
    protected String describe() {
        return "применил атаку Light Screen! Противнику снижен урон от специальных атак на 5 ходов";
    }
}
