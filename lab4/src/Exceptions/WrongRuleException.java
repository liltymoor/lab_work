package Exceptions;

import TranslatorClass.Translator;

public class WrongRuleException extends Exception{
    public WrongRuleException() {
        super(Translator.isEnglish ? "Wrong rules to play Pustyaki" : "Неправильные правила для игры в Пустяки.");
    }
}
