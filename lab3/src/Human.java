import java.util.Date;

public class Human extends Creature implements IHumanable{
    Human(int givenAge, String givenName, Date givenDateBirth) {
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
        return ((Translator.isEnglish) ? "Object of class <Human> | Age: " : "Объект класса человек | возраст: ") + age + " |";
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
    String getName() {
        return this.name;
    }
}
