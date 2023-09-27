import ru.ifmo.se.pokemon.*;

public class NewAttacks {
    private NewAttacks() {};

    public static class MuddyWater extends SpecialMove {
        private static final double power = 90;
        private static final double accuracy = 85;
        public MuddyWater() {
            super(Type.WATER, power, accuracy);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().chance(0.3).stat(Stat.ACCURACY, -1));
        }

        @Override
        protected String describe() {
            return "применил атаку Muddy Water! Точность врага может упасть";
        }
    }

    public static class Amnesia extends StatusMove {
        public Amnesia() { super(Type.PSYCHIC, 0, 0);}

        @Override
        protected void applySelfEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 2));
        }

        @Override
        protected String describe() {
            return "применил атаку Amnesia! Специальная защита увеличена на 2";
        }
    }

    public static class SacredFire extends PhysicalMove {
        private static final double power = 100;
        private static final double accuracy = 95;
        public SacredFire() { super(Type.FIRE, power, accuracy);}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (new Effect().chance(0.5).success())
                Effect.burn(pokemon);
        }

        @Override
        protected String describe() {
            return "применил атаку Sacred Fire! Противник может загореться";
        }
    }

    public static class ThunderShock extends SpecialMove {
        private static final double power = 40;
        private static final double accuracy = 100;
        public ThunderShock() { super(Type.ELECTRIC, power, accuracy);}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (new Effect().chance(0.1).success())
                Effect.paralyze(pokemon);
        }

        @Override
        protected String describe() {
            return "применил атаку Thunder Shock! Противник может быть парализован";
        }
    }

    public static class RazorWind extends SpecialMove {
        private static final double power = 80;
        private static final double accuracy = 100;
        public RazorWind() { super(Type.NORMAL, power, accuracy);}

        @Override
        protected String describe() {
            return "применил атаку Razor Wind!";
        }
    }

    public static class ShadowPunch extends PhysicalMove {
        private static final double power = 60;
        private static final double accuracy = 1000000;
        public ShadowPunch() { super(Type.GHOST, power, accuracy);}

        @Override
        protected String describe() {
            return "применил атаку Shadow Punch!";
        }
    }

    public static class ThunderWave extends StatusMove {
        private static final double power = 0;
        private static final double accuracy = 90;
        public ThunderWave() { super(Type.ELECTRIC, power, accuracy);}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            Effect.paralyze(pokemon);
        }

        @Override
        protected String describe() {
            return "применил атаку Thunder Wave! Противник парализован";
        }
    }

    public static class Blizzard extends SpecialMove {
        private static final double power = 110;
        private static final double accuracy = 70;
        public Blizzard() { super(Type.ICE, power, accuracy);}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (new Effect().chance(0.1).success())
                Effect.freeze(pokemon);
        }

        @Override
        protected String describe() {
            return "применил атаку Blizzard! Противник может быть заморожен";
        }
    }

    public static class LightScreen extends StatusMove {
        private static final double power = 0;
        private static final double accuracy = 0;
        public LightScreen() { super(Type.PSYCHIC, power, accuracy);}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(5).stat(Stat.SPECIAL_ATTACK, -3));
        }

        @Override
        protected String describe() {
            return "применил атаку Light Screen! Противнику снижен урон от специальных атак на 5 ходов";
        }
    }

    public static class Guillotine extends PhysicalMove {
        private static final double power = 0;
        private static final double accuracy = 30;
        private final int ownerLevel;
        public Guillotine(int ownerLevel) { super(Type.NORMAL, power, accuracy); this.ownerLevel = ownerLevel;}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (new Effect().chance(0.3 + (double) (ownerLevel - pokemon.getLevel()) / 10).success())
                pokemon.addEffect(new Effect().stat(Stat.HP, 0));
        }

        @Override
        protected String describe() {
            return "применил атаку Guillotine! Противник может потерять сознание";
        }
    }

    public static class Rage extends PhysicalMove {
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

    public static class DragonBreath extends SpecialMove {
        private static final double power = 60;
        private static final double accuracy = 100;
        public DragonBreath() { super(Type.DRAGON, power, accuracy);}

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (new Effect().chance(0.3).success())
                Effect.paralyze(pokemon);
        }

        @Override
        protected String describe() {
            return "применил атаку Dragon Breath! Противник может быть парализован";
        }
    }
}
