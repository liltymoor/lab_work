package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
    private static final double power = 60;
    private static final double accuracy = 1000000;
    public ShadowPunch() { super(Type.GHOST, power, accuracy);}

    @Override
    protected String describe() {
        return "применил атаку Shadow Punch!";
    }
}
