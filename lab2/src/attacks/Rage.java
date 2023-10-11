package attacks;

import ru.ifmo.se.pokemon.*;

public class Rage extends PhysicalMove {
    private static final double power = 20;
    private static final double accuracy = 100;
    public Rage() { super(Type.NORMAL, power, accuracy);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(2).stat(Stat.ATTACK, 2));
    }

    @Override
    protected String describe() {
        return "применил атаку Rage! Атака нападающего усилена";
    }
}
