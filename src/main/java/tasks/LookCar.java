package tasks;

import models.ReservationInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LookCar implements Task {

    private List<ReservationInformation> reservationInformation;

    public LookCar(List<ReservationInformation> reservationInformation) {
        this.reservationInformation = reservationInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(interactions.LookCar.withTheData(reservationInformation));
    }

    public static LookCar withTheData(List<ReservationInformation> reservationInformation) {
        return instrumented(LookCar.class, reservationInformation);
    }

}