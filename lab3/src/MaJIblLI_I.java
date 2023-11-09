import java.util.Date;

public class MaJIblLI_I extends Human{
    MaJIblLI_I(int givenAge, Date givenDateBirth) {
        super(givenAge, (Translator.isEnglish) ? "MALISH" : "МАЛЫШ", givenDateBirth);
    }

    void wantBirthdayPresentDog() {
        System.out.println((Translator.isEnglish) ? "I want Taksa :(" : "хочу Таксу :(");
    }
}
