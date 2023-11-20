import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;


public class SimpleFormTests extends BasePage {
    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo"); // Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    @Test
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("Test");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("Test"));
    }


    @Test
    public void enterSpecialCaractersAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("@#!");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("@#!"));
    }

    @Test
    public void enterNumbersAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("123");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("123"));
    }

    @Test
    public void enterSpaceAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("A B C");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("A B C"));
    }

    @Test
  public void enterFirstAndSecondValuesAndGetSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterTextInFirstValue("20");
        simpleFormPage.EnterTextInSecondValue("1");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("21"));
    }
                          //Tema
    @Test
    public void enterNegativeAndPositiveValuesAndGetSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterTextInFirstValue("-3");
        simpleFormPage.EnterTextInSecondValue("2");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("-1"));
    }
    @Test
    public void enterPositiveAndNegativeValuesAndGetSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterTextInFirstValue("9");
        simpleFormPage.EnterTextInSecondValue("-30");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("-21"));
    }

    @Test
    public void enterNegativeValuesAndGetSum(){
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.EnterTextInFirstValue("-21");
        simpleFormPage.EnterTextInSecondValue("-30");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        Assert.assertTrue(actualResult.contains("-51"));


    }


}

