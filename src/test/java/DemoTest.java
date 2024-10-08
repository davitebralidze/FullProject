import Pages.TestFirstPage.TestPage;
import WebDriverManager.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest {

    private WebDriver driver;
    private String textToInsert;

    @BeforeMethod
    @Parameters({"textToInsert", "browser"})
    public void start(String textToInsert, String browser) {
        this.textToInsert = textToInsert;
        driver = WebDriverManager.getInstance(browser).getDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test
    public void inputTest() {
        TestPage testPage = new TestPage(driver);
        testPage.enterName(textToInsert);
    }

    @AfterMethod
    public void end() {
        driver.quit();
    }

}
