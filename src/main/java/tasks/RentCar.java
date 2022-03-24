package tasks;

import interactions.PersonalInformation;
import models.ReservationInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RentCar implements Task {

    private List<ReservationInformation> reservationInformation;

    public RentCar(List<ReservationInformation> reservationInformation) {
        this.reservationInformation = reservationInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PersonalInformation.getInto(reservationInformation));
    }

    public static RentCar withTheData(List<ReservationInformation> reservationInformation) {
        return instrumented(RentCar.class, reservationInformation);
    }

}