package pokemons;

import attacks.Amnesia;
import attacks.MuddyWater;
import attacks.SacredFire;
import attacks.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swalot extends Pokemon {
    public Swalot(String s, int i) {
        super(s, i);
        setStats(
                100, // HP
                73, // ATTACK
                83, // DEFENCE
                73, // SPECIAL ATTACK
                83, // SPECIAL DEFENSE
                55 // SPEED
        );

        // Тип покемона POISON
        setType(Type.POISON);
        setMove(
                new MuddyWater(),
                new Amnesia(),
                new SacredFire(),
                new ThunderShock()
        );

    }
}