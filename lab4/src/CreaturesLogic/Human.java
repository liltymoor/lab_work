package CreaturesLogic;

import TranslatorClass.Translator;

import java.util.Date;

// S - single responsibility
// O - open/closed
// L - liskov principle (замена подтипами)
// I - interface segregation
// D - dependency inversion (abs dependency)

//        MyPredicate myPredicate = x -> x > 0;
//                System.out.println(myPredicate.test(10));

/* Таска №4
Так они и сделали. И представьте себе,
что Иа который никогда раньше не играл в эту игру, выигрывал чаще всех!
А Крошка Ру два раза свалился в реку. Первый раз случайно, а второй раз нарочно, потому что он увидел,
что из Лесу выходит Кенга, и понял, что ему все равно придется сейчас отправляться спать.
Кролик сказал, что он пойдет с ним, Тигра и Иа-Иа тоже ушли вместе, потому что Иа решил объяснить Тигре,
как выигрывать в Пустяки ("Надо пускать палочку с подковыркой, если ты понимаешь, что я хочу сказать, Тигра"),
а Кристофер Робин, и Пух, и Пятачок остались на мосту.
 */


public class Human extends Creature implements IHumanable{
    protected Human(int givenAge, String givenName, Date givenDateBirth) {
        age = givenAge;
        name = givenName;
        dateBirth = givenDateBirth;
    }
    // метод для дочерних классов с переопределением
    @Override
    public void talkToOthers(Creature human, String topic, boolean isAbleTo) {
        System.out.println((isAbleTo) ? ((Translator.isEnglish) ? "Can make" : "Может сделать") : ((Translator.isEnglish) ? "Can't make" : "Не может сделать") + ((Translator.isEnglish) ? " a talk about " : " Бла-бла-бла о ") + topic + " to " + human.getName());
    }
    // Create object emotions and emotions state
    @Override
    public void emote(Emotion emotion) {
        System.out.println(getName() + ((Translator.isEnglish) ? " right now is " : " сейчас ") + emotion.getEmotionName());
    }

    @Override
    public String toString() {
        return ((Translator.isEnglish) ? "Object of class <CreaturesLogic.Human> | Age: " : "Объект класса человек | возраст: ") + age + " |";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    protected String getName() {
        return this.name;
    }
}
