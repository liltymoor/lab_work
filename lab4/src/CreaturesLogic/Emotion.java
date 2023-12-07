package CreaturesLogic;

import TranslatorClass.Translator;

public enum Emotion {
    AMAZED((Translator.isEnglish) ? "AMAZED" : "ПОРАЖЕННЫЙ"),
    ANGRY((Translator.isEnglish) ? "ANGRY" : "ЗЛОЙ"),
    AGGRESSIVE((Translator.isEnglish) ? "AGGRESSIVE" : "АГРЕССИВНЫЙ"),
    CALM((Translator.isEnglish) ? "CALM" : "СПОКОЙНЫЙ"),
    DEPRESSED((Translator.isEnglish) ? "DEPRESSED" : "ДЕПРЕССИВНЫЙ"),
    ANXIOUS((Translator.isEnglish) ? "ANXIOUS" : "ТРЕВОЖНЫЙ");

    private final String emotionName;
    Emotion(String emotionName) { this.emotionName = emotionName; };
    public String getEmotionName() {return emotionName;};

}
