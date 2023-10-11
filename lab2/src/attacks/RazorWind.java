package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class RazorWind extends SpecialMove {
    private static final double power = 80;
    private static final double accuracy = 100;
    public RazorWind() { super(Type.NORMAL, power, accuracy);}

    @Override
    protected String describe() {
        return "применил атаку Razor Wind!";
    }
}
