package interactions;

import models.ReservationInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.PersonalInformation.BTN_RENT;


public class PersonalInformation implements Interaction {

    private List<ReservationInformation> reservationInformation;

    public PersonalInformation(List<ReservationInformation> reservationInformation) {
        this.reservationInformation = reservationInformation;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(reservationInformation.get(0).getName()).into(userinterfaces.PersonalInformation.LBL_NAME),
                Enter.theValue(reservationInformation.get(0).getLastName()).into(userinterfaces.PersonalInformation.LBL_LAST_NAME),
                Enter.theValue(reservationInformation.get(0).getCardNumber()).into(userinterfaces.PersonalInformation.LBL_CARD_NUMBER),
                Enter.theValue(reservationInformation.get(0).getEmail()).into(userinterfaces.PersonalInformation.LBL_EMAIL),
                Click.on(BTN_RENT)
        );
    }

    public static PersonalInformation getInto(List<ReservationInformation> reservationInformation) {
        return Tasks.instrumented(PersonalInformation.class, reservationInformation);
    }

}
