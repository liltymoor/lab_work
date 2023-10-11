package pokemons;

import attacks.Guillotine;
import attacks.LightScreen;
import attacks.Rage;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scolipede extends Pokemon {
    public Scolipede(String s, int i) {
        super(s, i);
        setStats(
                60, // HP
                100, // ATTACK
                89, // DEFENCE
                55, // SPECIAL ATTACK
                69, // SPECIAL DEFENSE
                112 // SPEED
        );

        // Тип покемона POISON
        setType(Type.BUG, Type.POISON);
        setMove(
                new LightScreen(),
                new Guillotine(getLevel()),
                new Rage()
        );

    }
}
