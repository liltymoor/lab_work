package attacks;

import ru.ifmo.se.pokemon.*;

public class Guillotine extends PhysicalMove {
    private static final double power = 0;
    private static final double accuracy = 30;
    private final int ownerLevel;
    public Guillotine(int ownerLevel) { super(Type.NORMAL, power, accuracy); this.ownerLevel = ownerLevel;}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (new Effect().chance(0.3 + (double) (ownerLevel - pokemon.getLevel()) / 10).success())
            pokemon.addEffect(new Effect().stat(Stat.HP, 0));
    }

    @Override
    protected String describe() {
        return "применил атаку Guillotine! Противник может потерять сознание";
    }
}