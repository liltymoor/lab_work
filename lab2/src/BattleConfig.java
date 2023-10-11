import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class BattleConfig {
    public static void main(String[] args) {
        Battle testBattle = new Battle();

        Swalot player1 = new Swalot("Сволочь", 10);
        Torchic player2 = new Torchic("Торч", 10);
        Wailmer player3 = new Wailmer("Синий кит", 10);

        testBattle.addAlly(player1);
        testBattle.addAlly(player2);
        testBattle.addAlly(player3);

        Scolipede player4 = new Scolipede("Сколопендра", 10);
        Wailord player5 = new Wailord("Большой синий кит", 7);
        Rotom player6 = new Rotom("Ртом", 10);

        testBattle.addFoe(player4);
        testBattle.addFoe(player5);
        testBattle.addFoe(player6);
        
        testBattle.go();
    }
}