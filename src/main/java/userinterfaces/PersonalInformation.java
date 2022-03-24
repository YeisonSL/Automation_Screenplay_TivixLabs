package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {

    private PersonalInformation() {

    }

    public static final Target LBL_NAME = Target.the("Name")
            .located(By.xpath("//input[@id='name']"));

    public static final Target LBL_LAST_NAME = Target.the("Last Name")
            .located(By.xpath("//input[@id='last_name']"));


    public static final Target LBL_CARD_NUMBER = Target.the("Card Cumber")
            .located(By.xpath("//input[@id='card_number']"));

    public static final Target LBL_EMAIL = Target.the("Email")
            .located(By.xpath("//input[@id='email']"));

    public static final Target TEXT_WRONG = Target.the("Text of rent wrong")
            .located(By.cssSelector("h1"));

    public static final Target BTN_RENT = Target.the("Rent")
            .located(By.xpath("//button[@class='btn btn-primary']"));

}
