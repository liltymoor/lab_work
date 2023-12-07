import Characters.*;
import CreaturesLogic.Creature;
import CreaturesLogic.Emotion;
import Exceptions.UnluckException;
import Exceptions.WrongRuleException;
import GameLogic.IGame;
import TranslatorClass.Translator;

import java.io.IOException;
import java.util.*;

// Error - OutOfMemoryError, StackOverflowError
// Runtime Exceptions - unchecked by compiler
// Exceptions - checked

public class Main {
    public static void main(String[] args) throws WrongRuleException {
        System.out.println("Выберите язык программы | Choose programm language : [R(ussian)/E(nglish)]");
        boolean is_eng = false;

        try {
            is_eng = ((char)System.in.read()) == 'E';
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Translator.setEnglish(is_eng);

        Day currentDay = new Day(TimeState.DAYTIME, 9, 10, 2023);

        Karlson karlson = new Karlson(100, new Date(2003,10,21));
        MaJIblLI_I mal = new MaJIblLI_I(8, new Date(2010, 10, 10));

        Emotion randomEmotion = Emotion.values()[new Random().nextInt(Emotion.values().length)];
        karlson.emote(randomEmotion);

        karlson.talkToOthers(mal, ((Translator.isEnglish) ? "Characters.Karlson's grandmother" : "бабушка Карлсона"), false);
        karlson.talkToOthers(mal, ((Translator.isEnglish) ? "Malish's birthday" : "день рождения Малыша"), false);
        karlson.talkToOthers(mal, ((Translator.isEnglish) ? "nothing" : "ни о чем"), false);

        currentDay.changeTimeState(TimeState.NIGHTTIME);
        mal.sleep();
        currentDay.nextDay();


        IGame IAGame = new IGame() {
            @Override
            public boolean PlayGame(Creature player) {
                if (Objects.equals(player.toString(), "ИА") || Objects.equals(player.toString(), "IA")){
                    return true;
                }
                return new Random().nextInt(2) == 1;
            }
        };

        IA osel = new IA();
        IAGame.PlayGame(osel);
        IAGame.PlayGame(osel);
        IAGame.PlayGame(osel);
        IAGame.PlayGame(osel);

        KroshkaRU kroshkaRU = new KroshkaRU();

        try { // Пробуем не потерять ментальное здоровье
            kroshkaRU.makeUnluckMove(KroshkaRU.UnluckMoves.fallInRiver);
        } catch (UnluckException ex) {
            // не получилось
            System.out.println(Translator.isEnglish ?
                    "Kroshka RU have a bad luck today: " + KroshkaRU.UnluckMoves.fallInRiver :
                    "Крошка Ру испытывает недуачу сейчас: " + KroshkaRU.UnluckMoves.fallInRiver);
        }
        try { // Пробуем не потерять ментальное здоровье
            kroshkaRU.makeUnluckMove(KroshkaRU.UnluckMoves.fallOutOfCarWhileDriving);
        } catch (UnluckException ex) {
            // не получилось
            System.out.println(Translator.isEnglish ?
                    "Kroshka RU have a bad luck today: " + KroshkaRU.UnluckMoves.fallOutOfCarWhileDriving :
                    "Крошка Ру испытывает недуачу сейчас: " + KroshkaRU.UnluckMoves.fallOutOfCarWhileDriving);
        }
        kroshkaRU.sleep();
        Krolik krolik = new Krolik();
        krolik.sleep();

        Tigra tigra = new Tigra();
        try {
            PustyakiGame game = new PustyakiGame("Надо пускать палочку с подковыркой");
        } catch (WrongRuleException ex) {
            System.out.println(Translator.isEnglish ? "We need another kind of rules to play this game" : "Нам нужны другие правила");
        }
    }
}