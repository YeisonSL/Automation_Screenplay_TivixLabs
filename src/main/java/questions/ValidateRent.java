package questions;

import enums.WrongMessage;
import exceptions.GeneralException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.PersonalInformation.TEXT_WRONG;

public class ValidateRent implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        try {
          TEXT_WRONG.resolveFor(actor).getText().equals(WrongMessage.WRONG_MESSAGE);
            return true;
        } catch (GeneralException ex) {
            return false;
        }
    }

    public static ValidateRent wrong() {
        return new ValidateRent();
    }
}