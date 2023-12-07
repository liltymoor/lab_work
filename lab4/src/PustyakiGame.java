import CreaturesLogic.Creature;
import Exceptions.WrongRuleException;
import GameLogic.IGame;

import java.util.Objects;

public class PustyakiGame implements IGame {
    public PustyakiGame(String rule) throws WrongRuleException {
        if (!Objects.equals(rule, "Надо пускать палочку с подковыркой"))
            throw new WrongRuleException();
    }
    @Override
    public boolean PlayGame(Creature player) {
        return true;
    }
}
