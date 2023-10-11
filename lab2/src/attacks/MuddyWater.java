package attacks;

import ru.ifmo.se.pokemon.*;

public class MuddyWater extends SpecialMove {
    private static final double power = 90;
    private static final double accuracy = 85;
    public MuddyWater() {
        super(Type.WATER, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).stat(Stat.ACCURACY, -1));
    }

    @Override
    protected String describe() {
        return "применил атаку Muddy Water! Точность врага может упасть";
    }
}