package stepdefinitions;

import enums.Llave;
import enums.Portal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Entonces;
import models.ReservationInformation;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateRent;
import tasks.LookCar;
import tasks.RentCar;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static utilities.Constantes.USUARIO;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RentaCar {

    @DataTableType
    public ReservationInformation reservationEntry(Map<String, String> entry) {
        return new ReservationInformation(
                entry.get("country"),
                entry.get("city"),
                entry.get("model"),
                entry.get("pickUpDate"),
                entry.get("dropUpDate"),
                entry.get("name"),
                entry.get("lastName"),
                entry.get("cardNumber"),
                entry.get("email")

        );

    }


    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the client enters the tivix portal")
    public void theClientEntersTheTivixPortal() {
        theActor(USUARIO).wasAbleTo(Open.url(Portal.TIVIX.getPortal()));
    }

    @When("the customer looks for the car")
    public void theCustomerLooksForTheCar(List<ReservationInformation> infoProgramacion) {
        theActorInTheSpotlight().attemptsTo(LookCar.withTheData(infoProgramacion));

    }

    @And("make the reservation")
    public void MakeTheTeservation(List<ReservationInformation> infoProgramacion){
        theActorInTheSpotlight().attemptsTo(RentCar.withTheData(infoProgramacion));
    }

    @Entonces("the client should see reservation information")
    public void theClientShouldSeeReservationInformationn() {;
      theActorInTheSpotlight().should(seeThat(ValidateRent.wrong(), equalTo(true)));
    }
}
