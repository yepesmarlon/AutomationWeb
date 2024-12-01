package task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.OrangeHRMUI;

public class OrangeHRMTask {

    public static Performable openBrowserTask() {
        return Task.where(
                "Apertura del navegador",
                Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        );
    }

    public static Performable ingressPages(String userName, String Password) {
        return Task.where(
                "Ingresar con credenciales",
                SendKeys.of(userName).into(OrangeHRMUI.FIELD_USERNAME),
                SendKeys.of(Password).into(OrangeHRMUI.FIELD_PASSWORD),
                Click.on(OrangeHRMUI.BUTTON_LOGIN)
        );
    }

    public static Performable completeForm(String field, String value) {
        return Task.where(
                "Completo el formulario",
                actor -> {
                    if (actor.asksFor()) {

                    }
                }
        );
    }
}
