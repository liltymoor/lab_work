package pokemons;

import attacks.DragonBreath;
import attacks.Guillotine;
import attacks.LightScreen;
import attacks.Rage;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wailord extends Pokemon {
    public Wailord(String s, int i) {
        super(s, i);
        setStats(
                170, // HP
                90, // ATTACK
                45, // DEFENCE
                90, // SPECIAL ATTACK
                45, // SPECIAL DEFENSE
                60 // SPEED
        );

        // Тип покемона POISON
        setType(Type.WATER);
        setMove(
                new LightScreen(),
                new Guillotine(getLevel()),
                new Rage(),
                new DragonBreath()
        );

    }
}