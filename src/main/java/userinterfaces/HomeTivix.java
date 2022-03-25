package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeTivix {

    private HomeTivix() {
    }

    public static final Target BTN_COUNTRY = Target.the("Country")
            .located(By.id("country"));

    public static final Target BTN_CITY = Target.the("City")
            .located(By.id("city"));

    public static final  Target INPUT_MODEL = Target.the("Model")
            .located(By.id("model"));

    public static final  Target INPUT_PICK_UP_DATE = Target.the("Pick-up date")
            .located(By.id("pickup"));

    public static final  Target INPUT_DROP_UP_DATE = Target.the("Drop-off date")
            .located(By.id("dropoff"));

    public static final Target BTN_SEARCH = Target.the("Search")
            .located(By.cssSelector(".btn-primary"));

    public static final Target LBL_MODEL_CAR(String carOption) {
        return Target.the("List of available cars")
                .located(By.xpath("//td[.='"+carOption+"']//ancestor::tr//child::td[4]"));
    }

    public static final Target BTN_RENT (int carOption){
        return Target.the("Buttons Rent")
                .located(By.xpath("//td[.='"+carOption+"$']//parent::tr//child::td"));
    }

    public static final Target BTN_RENT_CONTINUE = Target.the("Button cotinue")
            .located(By.xpath("//a[.='Rent!']"));
}
