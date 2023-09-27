import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NewPokemons {
    public static class Swalot extends Pokemon {
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
                    new NewAttacks.MuddyWater(),
                    new NewAttacks.Amnesia(),
                    new NewAttacks.SacredFire(),
                    new NewAttacks.ThunderShock()
                    );

        }
    }

    public static class Torchic extends Pokemon {
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
                    new NewAttacks.RazorWind(),
                    new NewAttacks.ShadowPunch(),
                    new NewAttacks.ThunderWave()
            );

        }
    }

    public static class Rotom extends Pokemon {
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
                    new NewAttacks.RazorWind(),
                    new NewAttacks.ShadowPunch(),
                    new NewAttacks.ThunderWave(),
                    new NewAttacks.Blizzard()
            );

        }
    }

    public static class Wailmer extends Pokemon {
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
                    new NewAttacks.LightScreen(),
                    new NewAttacks.Guillotine(getLevel())
            );

        }
    }

    public static class Scolipede extends Pokemon {
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
                    new NewAttacks.LightScreen(),
                    new NewAttacks.Guillotine(getLevel()),
                    new NewAttacks.Rage()
            );

        }
    }

    public static class Wailord extends Pokemon {
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
                    new NewAttacks.LightScreen(),
                    new NewAttacks.Guillotine(getLevel()),
                    new NewAttacks.Rage(),
                    new NewAttacks.DragonBreath()
            );

        }
    }
}
