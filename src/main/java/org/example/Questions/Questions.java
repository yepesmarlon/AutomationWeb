package org.example.Questions;

import net.serenitybdd.screenplay.Question;
import org.example.Locators.Locators;

public class Questions {

    public static Question<String> textError() {
        return actor -> Locators.TEXT_ERROR.resolveFor(actor).getText().trim();
    }

}
