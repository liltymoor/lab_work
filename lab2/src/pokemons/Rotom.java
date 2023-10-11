package pokemons;

import attacks.Blizzard;
import attacks.RazorWind;
import attacks.ShadowPunch;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rotom extends Pokemon {
    public Rotom(String s, int i) {
        super(s, i);
        setStats(
                50, // HP
                50, // ATTACK
                77, // DEFENCE
                95, // SPECIAL ATTACK
                77, // SPECIAL DEFENSE
                91 // SPEED
        );

        // Тип покемона POISON
        setType(Type.ELECTRIC, Type.GHOST);
        setMove(
                new RazorWind(),
                new ShadowPunch(),
                new ThunderWave(),
                new Blizzard()
        );

    }
}