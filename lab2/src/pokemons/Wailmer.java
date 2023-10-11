package pokemons;

import attacks.Guillotine;
import attacks.LightScreen;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wailmer extends Pokemon {
    public Wailmer(String s, int i) {
        super(s, i);
        setStats(
                130, // HP
                70, // ATTACK
                35, // DEFENCE
                70, // SPECIAL ATTACK
                35, // SPECIAL DEFENSE
                60 // SPEED
        );

        // Тип покемона POISON
        setType(Type.WATER);
        setMove(
                new LightScreen(),
                new Guillotine(getLevel())
        );

    }
}