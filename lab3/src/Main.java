import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите язык программы | Choose programm language : [R(ussian)/E(nglish)]");
        boolean is_eng = false;

        try {
            is_eng = ((char)System.in.read()) == 'E';
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Translator.setEnglish(is_eng);

        // случайную составляющую добавить (random)

        Day currentDay = new Day(TimeState.DAYTIME, 9, 10, 2023);

        Karlson karlson = new Karlson(100, new Date(2003,10,21));
        MaJIblLI_I mal = new MaJIblLI_I(8, new Date(2010, 10, 10));

        Emotion randomEmotion = Emotion.values()[new Random().nextInt(Emotion.values().length)];
        karlson.emote(randomEmotion);

        karlson.talkToOthers(mal, ((Translator.isEnglish) ? "Karlson's grandmother" : "бабушка Карлсона"), false);
        karlson.talkToOthers(mal, ((Translator.isEnglish) ? "Malish's birthday" : "день рождения Малыша"), false);
        karlson.talkToOthers(mal, ((Translator.isEnglish) ? "nothing" : "ни о чем"), false);

        currentDay.changeTimeState(TimeState.NIGHTTIME);
        mal.sleep();
        currentDay.nextDay();

    }
}