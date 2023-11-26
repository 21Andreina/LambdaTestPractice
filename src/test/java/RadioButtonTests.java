import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxPage;
import pages.RadioButtonPage;

public class RadioButtonTests extends BasePage {
    private RadioButtonPage RadioButtonPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        RadioButtonPage = new RadioButtonPage(driver);
    }


    //Click on button to get the selected value.
    @Test
    public void clickOnMaleRadioButtonAndGetValue() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonPage.clickOnMaleRadioButton();
        RadioButtonPage.clickOnGetValueButton();

        String actualResult = driver.findElement(By.cssSelector("#__next > div > section.mt-30 > div > div > div > div:nth-child(1) > div > p.text-gray-900.text-size-15.my-10.text-black.radiobutton")).getText();
        Assert.assertTrue(actualResult.contains("Radio button 'Male' is checked"));
    }

        @Test
        public void clickOnFemaleRadioButtonAndGetValue(){
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonPage.clickOnFemaleButton();
        RadioButtonPage.clickOnGetValueButton();

        String actualResult = driver.findElement(By.cssSelector("#__next > div > section.mt-30 > div > div > div > div:nth-child(1) > div > p.text-gray-900.text-size-15.my-10.text-black.radiobutton")).getText();
        Assert.assertTrue(actualResult.contains("Radio button 'Female' is checked"));



    }

    //Disabled Radio Button
    @Test
    public void clickOnRadioButton1() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonPage.clickOnRadioButton1();
    }
    @Test
    public void clickOnRadioButton2() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonPage.clickOnRadioButton2();
    }



    @Test
    public void clickOnMaleGenderAnd0To5AgeCategory(){
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonPage.clickOnMaleGenderButton();
        RadioButtonPage.setClickOn0To5AgeCategoryButton();
        RadioButtonPage.setClickOnGetValueButton2();

    }



}




