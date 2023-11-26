import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxPage;

public class CheckboxTests extends BasePage {
    private CheckboxPage checkboxPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkboxPage = new CheckboxPage(driver);

    }
    //Single Checkbox Demo
    @Test
    public void clickOnTheSingleCheckboxCheckmark(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnSingleCheckbox();

        String actualResult= driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
        Assert.assertEquals(actualResult,"Checked");

        /*String actualResult2= driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertFalse(actualResult2.contains("Checked"));*/

    }

   //Disabled Checkbox Demo
    @Test
            public void clickOnCheckboxOption1AndOption2(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnCheckboxOption1();
        checkboxPage.clickOnCheckboxOption2();


    }
   //Multiple Checkbox Demo
    @Test
public void clickOnAllMultipleCheckboxoptions(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnMultipleCheckboxDemoOption1();
        checkboxPage.clickOnMultipleCheckboxDemoOption2();
        checkboxPage.clickOnMultipleCheckboxDemoOption3();
        checkboxPage.clickOnMultipleCheckboxDemoOption4();

    }

    @Test
    public void clickOnTheCheckAllButton(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnCheckAllButton();

        String actualResult = driver.findElement(By.cssSelector("input[value=\"Uncheck All\"]")).getAccessibleName();
        Assert.assertTrue(actualResult.contains("Uncheck All"));
    }


}
