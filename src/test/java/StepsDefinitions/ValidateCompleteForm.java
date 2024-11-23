package StepsDefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.example.Locators.Locators;
import org.example.Questions.Questions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ValidateCompleteForm {

    @io.cucumber.java.en.Given("^actor abre la pagina de Orange HRM$")
    public void OpenBrowser() {
        theActorInTheSpotlight().attemptsTo(
                Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
                SendKeys.of("Admin").into(Locators.FIELD_NAME),
                SendKeys.of("admin123").into(Locators.FIELD_PASSWORD),
                Click.on(Locators.BUTTON_CONTINUE)
        );
    }

    @When("^completa el formulario del proceso de contracación$")
    public void completeFormTheProcess() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(Locators.BUTTON_RECRUITMENT),
                Click.on(Locators.BUTTON_ADD),
                SendKeys.of("Admin").into(Locators.FIELD_NAME_FORM),
                SendKeys.of("name").into(Locators.FIELD_SECOND_NAME),
                SendKeys.of("apellido").into(Locators.FIELD_LAST_NAME),
                SendKeys.of("email@test.com").into(Locators.FIELD_EMAIL),
                Click.on(Locators.BUTTON_SAVE)
        );
    }

    @io.cucumber.java.en.Then("^validar los textos del resultado$")
    public void validateTextResults() {
        theActorInTheSpotlight().should();
        seeThat("se visualiza el mensaje de error 403", Questions.textError(), equalTo("403")
        );
    }
}
