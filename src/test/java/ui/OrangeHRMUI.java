package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHRMUI {

    public static final Target FIELD_USERNAME = Target.the("Campo de usuario")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]" +
                    "/form/div[1]/div/div[2]/input"));

    public static final Target FIELD_PASSWORD = Target.the("Campo de contraseña")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/" +
                    "form/div[2]/div/div[2]/input"));

    public static final Target BUTTON_LOGIN = Target.the("Boton de Login")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

    public static final Target OPTION_HIRING = Target.the("Opción de reclutamiento")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));

    public static final Target BUTTON_ADD = Target.the("Botón de agregar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));

    public static final Target FIELD_FIRST_NAME = Target.the("Campo de nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/" +
                    "div/div[2]/div[1]/div[2]/input"));

    public static final Target FIELD_MIDDLE_NAME = Target.the("Campo de segundo nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div" +
                    "/div[2]/div[2]/div[2]/input"));

    public static final Target LAST_NAME = Target.the("Campo de apellido")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]" +
                    "/div[3]/div[2]/input"));

    public static final Target FIELD_VACANCY = Target.the("Campo de vocación")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]" +
                    "/div/div"));

    public static final Target FIELD_JUNIOR_ASSISTANT = Target.the("Campo de asistencia")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/" +
                    "div/div[2]/div/div/div[1]"));

    public static final Target FIELD_EMAIL = Target.the("Campo de email")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]" +
                    "/div/div[2]/input"));

    public static final Target FIELD_NUMBER = Target.the("Campo de número")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]" +
                    "/div/div[2]/input"));

    public static final Target FIELD_KEYBOARD = Target.the("Campo de keyboard")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]" +
                    "/div/div[2]/input"));

    public static final Target FIELD_NOTES = Target.the("Campo de notas")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/" +
                    "div[2]/textarea"));

    public static final Target CHECK_BOX = Target.the("Check box")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div" +
                    "/div[2]/div/label/span/i"));

    public static final Target BUTTON_SAVE = Target.the("Botón de guardar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));
}
