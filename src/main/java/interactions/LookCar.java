package interactions;

import models.ReservationInformation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeTivix.BTN_CITY;
import static userinterfaces.HomeTivix.BTN_COUNTRY;
import static userinterfaces.HomeTivix.BTN_RENT_CONTINUE;
import static userinterfaces.HomeTivix.BTN_SEARCH;
import static userinterfaces.HomeTivix.INPUT_DROP_UP_DATE;
import static userinterfaces.HomeTivix.INPUT_MODEL;
import static userinterfaces.HomeTivix.INPUT_PICK_UP_DATE;


public class LookCar implements Task {

    private List<ReservationInformation> reservationInformation;

    public LookCar(List<ReservationInformation> reservationInformation) {
        this.reservationInformation = reservationInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(reservationInformation.get(0).getCountry()).from(BTN_COUNTRY),
                SelectFromOptions.byVisibleText(reservationInformation.get(0).getCity()).from(BTN_CITY),
                Enter.theValue(reservationInformation.get(0).getModel()).into(INPUT_MODEL),
                Enter.theValue(reservationInformation.get(0).getPickUpDate()).into(INPUT_PICK_UP_DATE),
                Enter.theValue(reservationInformation.get(0).getDropUpDate()).into(INPUT_DROP_UP_DATE),
                Click.on(BTN_SEARCH),
                SelectCar.option(reservationInformation.get(0).getModel())

        );
    }

    public static LookCar withTheData(List<ReservationInformation> reservationInformation) {
        return instrumented(LookCar.class, reservationInformation);
    }

}