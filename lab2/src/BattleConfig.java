import ru.ifmo.se.pokemon.Battle;

public class BattleConfig {
    public static void main(String[] args) {
        Battle testBattle = new Battle();

        NewPokemons.Swalot player1 = new NewPokemons.Swalot("Сволочь", 10);
        NewPokemons.Torchic player2 = new NewPokemons.Torchic("Торч", 10);
        NewPokemons.Wailmer player3 = new NewPokemons.Wailmer("Синий кит", 10);

        testBattle.addAlly(player1);
        testBattle.addAlly(player2);
        testBattle.addAlly(player3);

        NewPokemons.Scolipede player4 = new NewPokemons.Scolipede("Сколопендра", 10);
        NewPokemons.Wailord player5 = new NewPokemons.Wailord("Большой синий кит", 7);
        NewPokemons.Rotom player6 = new NewPokemons.Rotom("Ртом", 10);

        testBattle.addFoe(player4);
        testBattle.addFoe(player5);
        testBattle.addFoe(player6);
        
        testBattle.go();
    }
}