import TranslatorClass.Translator;

public enum TimeState{
    // public static final by default
    DAYTIME((Translator.isEnglish) ? "DAYTIME" : "ДЕНЬ"),
    NIGHTTIME((Translator.isEnglish) ? "NIGHTTIME" : "НОЧЬ");

    private final String stateName;
    TimeState(String stateName) {this.stateName = stateName;}
    public String getStateName() {return stateName; }
}