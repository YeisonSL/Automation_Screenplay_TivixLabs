package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import java.util.List;

import static userinterfaces.HomeTivix.BTN_RENT;
import static userinterfaces.HomeTivix.BTN_RENT_CONTINUE;
import static userinterfaces.HomeTivix.LBL_MODEL_CAR;


public class SelectCar implements Interaction {

    private String modelCar;
    List<WebElementFacade> priceCars;
    List<WebElementFacade> btnRents;
    int cantidadRents;

    public SelectCar(String modelCar) {
        this.modelCar = modelCar;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
       priceCars = LBL_MODEL_CAR(modelCar).resolveAllFor(actor);
       int valorMenor =  Integer.parseInt(priceCars.get(0).getText().replace("$", ""));
       for (int i = 0; i< priceCars.size(); i++){
           int numeroActual = Integer.parseInt(priceCars.get(i).getText().replace("$", ""));
            if (numeroActual <= valorMenor ){
                valorMenor = numeroActual;
                btnRents = BTN_RENT(valorMenor).resolveAllFor(actor);
                cantidadRents = btnRents.size() - 1;
                actor.attemptsTo(
                        Click.on(btnRents.get(cantidadRents)),
                        WaitFor.seconds(2),
                        Click.on(BTN_RENT_CONTINUE));
                break;
            }
       }
    }

    public static SelectCar option(String modelCar) {
        return Tasks.instrumented(SelectCar.class, modelCar);
    }

}
