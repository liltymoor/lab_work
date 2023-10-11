package pokemons;

import attacks.RazorWind;
import attacks.ShadowPunch;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Torchic extends Pokemon {
    public Torchic(String s, int i) {
        super(s, i);
        setStats(
                45, // HP
                60, // ATTACK
                40, // DEFENCE
                70, // SPECIAL ATTACK
                50, // SPECIAL DEFENSE
                45 // SPEED
        );

        // Тип покемона POISON
        setType(Type.FIRE);
        setMove(
                new RazorWind(),
                new ShadowPunch(),
                new ThunderWave()
        );

    }
}