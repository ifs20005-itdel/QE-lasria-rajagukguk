package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Homepage extends PageObject {
    private By title(){
        return By.className("title");
    }

    @Step
    public void validateOnHomepage(){
        $(title()).isDisplayed();
    }
}
