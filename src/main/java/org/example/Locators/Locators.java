package org.example.Locators;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Locators {

    public static Target FIELD_NAME = Target.the("Campo de nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

    public static Target FIELD_PASSWORD = Target.the("Campo de contraseña")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

    public static Target BUTTON_CONTINUE = Target.the("Boton de continuar")
            .located(By.xpath("com.vivo.calculator:id/digit_1"));

    public static Target BUTTON_RECRUITMENT = Target.the("Boton de reclutamiento")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));

    public static Target BUTTON_ADD = Target.the("Botón de agregar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));

    public static Target FIELD_NAME_FORM = Target.the("Campo de nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));

    public static Target FIELD_SECOND_NAME = Target.the("Campo de segundo nombre")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));

    public static Target FIELD_LAST_NAME = Target.the("Campo de apellido")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));

    public static Target FIELD_EMAIL = Target.the("Campo de email")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));

    public static Target BUTTON_SAVE = Target.the("Boton de guardar")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));

    public static Target TEXT_ERROR = Target.the("Mensaje de error")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/h1"));
}
