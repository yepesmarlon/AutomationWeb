package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import task.OrangeHRMTask;
import ui.OrangeHRMUI;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidateFormHiringSteps {

    @Given("^actor se loguea en la página web$")
    public void LoginPagesWeb(DataTable dataTable) {
        List<Map<String, String>> accountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : accountDataList) {
            String expectValueName = accountData.get("User name");
            String expectValuePassword = accountData.get("Password");


            theActorInTheSpotlight().attemptsTo(
                    OrangeHRMTask.openBrowserTask(),
                    OrangeHRMTask.ingressPages(expectValueName, expectValuePassword)
            );
        }
    }

    @Then("^completa el formulario de contratación$")
    public void completeFormHiring(DataTable dataTable) {
        List<Map<String, String>> accountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : accountDataList) {
            String expectFields = accountData.get("Fields");
            String expectValues = accountData.get("Data");

            theActorInTheSpotlight().attemptsTo(
                    Click.on(OrangeHRMUI.OPTION_HIRING),
                    Click.on(OrangeHRMUI.BUTTON_ADD)
            );
        }
    }

    @Then("^valida el resultado del formulario$")
    public void validateResultForm() {
        theActorInTheSpotlight().should(

        );
    }
}
