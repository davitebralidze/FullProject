package Pages.TestFirstPage;

import Pages.AbstractPage;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
public class TestPage extends AbstractPage {

    private static final Logger log = LoggerFactory.getLogger(TestPage.class);

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputBox;

    @Step
    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOf(inputBox)).sendKeys(name);
    }

}
