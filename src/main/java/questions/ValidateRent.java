package questions;

import enums.Llave;
import enums.WrongMessage;
import exceptions.ExcepcionGeneral;
import models.ReservationInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.PersonalInformation.TEXT_WRONG;

public class ValidateRent implements Question<Boolean> {

    private List<ReservationInformation> producto = theActorInTheSpotlight().recall(Llave.LLAVE.getLlave());

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
          TEXT_WRONG.resolveFor(actor).getText().equals(WrongMessage.WRONG_MESSAGE);
            return true;
        } catch (ExcepcionGeneral ex) {
            return false;
        }
    }

    public static ValidateRent wrong() {
        return new ValidateRent();
    }
}