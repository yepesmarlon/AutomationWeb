package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import ui.OrangeHRMUI;

public class OrangeHRMQuestions {


    public static Question<String> fieldUsername() {
        return actor -> OrangeHRMUI.FIELD_USERNAME.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldPassword() {
        return actor -> OrangeHRMUI.FIELD_PASSWORD.resolveFor(actor).getText().trim();
    }

    public static Question<String> buttonLogin() {
        return actor -> OrangeHRMUI.BUTTON_LOGIN.resolveFor(actor).getText().trim();
    }

    public static Question<String> optionHiring() {
        return actor -> OrangeHRMUI.OPTION_HIRING.resolveFor(actor).getText().trim();
    }

    public static Question<String> buttonAdd() {
        return actor -> OrangeHRMUI.BUTTON_ADD.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldFirstName() {
        return actor -> OrangeHRMUI.FIELD_FIRST_NAME.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldMiddleName() {
        return actor -> OrangeHRMUI.FIELD_MIDDLE_NAME.resolveFor(actor).getText().trim();
    }

    public static Question<String> lastName() {
        return actor -> OrangeHRMUI.LAST_NAME.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldVacancy() {
        return actor -> OrangeHRMUI.FIELD_VACANCY.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldJuniorAssistant() {
        return actor -> OrangeHRMUI.FIELD_JUNIOR_ASSISTANT.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldEmail() {
        return actor -> OrangeHRMUI.FIELD_EMAIL.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldNumber() {
        return actor -> OrangeHRMUI.FIELD_NUMBER.resolveFor(actor).getText().trim();
    }

    public static Question<String> FIELD_KEYBOARD() {
        return actor -> OrangeHRMUI.FIELD_KEYBOARD.resolveFor(actor).getText().trim();
    }

    public static Question<String> fieldNotes() {
        return actor -> OrangeHRMUI.FIELD_NOTES.resolveFor(actor).getText().trim();
    }

    public static Question<String> checkBox() {
        return actor -> OrangeHRMUI.CHECK_BOX.resolveFor(actor).getText().trim();
    }

    public static Question<String> buttonSave() {
        return actor -> OrangeHRMUI.BUTTON_SAVE.resolveFor(actor).getText().trim();
    }
}
