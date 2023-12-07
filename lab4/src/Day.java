import TranslatorClass.Translator;

import java.util.Calendar;

public class Day implements ITimeStateChangable{
    private TimeState currentState;
    private final Calendar date;
    Day(TimeState state, int day, int month, int year) {
        currentState = state;
        date = Calendar.getInstance();
        date.set(year, month, day);
    }
    public TimeState getCurrentState() {return currentState;}

    void nextDay() {
        date.add(Calendar.DATE, 1);
    }

    @Override
    public void changeTimeState(TimeState state) {
        System.out.println(currentState.getStateName() + ((Translator.isEnglish) ? " changes to " : " меняется на ") + state.getStateName());
        currentState = state;
    }
}
