package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resources/features/rent_car.feature",
        tags = "@RentCar" ,
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class RentCar {

}
