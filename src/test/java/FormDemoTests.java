import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FormDemoPage;



public class FormDemoTests extends BasePage {
    private FormDemoPage FormDemoPage;
    private final By FormDemoLink = By.linkText("Input Form Submit");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        FormDemoPage = new FormDemoPage(driver);
    }

    @Test
    public void enterTextInFields(){
        driver.findElement(FormDemoLink).click();
        FormDemoPage.typeNameInNameField("Andreina");
        FormDemoPage.typeEmailInEmailField("a@Yahoo.com");
        FormDemoPage.typePasswordInPasswordField("Asdasd123");
        FormDemoPage.typeCompanyInCompanyField("lol company");
        FormDemoPage.typeWebsiteInWebsiteField("www.lol.ro");
        FormDemoPage.clickOnChooseACountry();
        FormDemoPage.clickOnRomaniaCountry();
        FormDemoPage.typeCityInCityField("Rm.Valcea");
        FormDemoPage.typeAddressInAddres1Field("Str. I.L.Caragiale");
        FormDemoPage.typeAddressInAddress2Field("Str. I.L.Caragiale2");
        FormDemoPage.typeStateinStateField("Valcea");
        FormDemoPage.typeZipInZipCodeField("20053");
        FormDemoPage.clickOnSubmitButton();
        FormDemoPage.getASubmitMessage();

        String actualResult = driver.findElement(By.cssSelector("#__next > div > section.mt-50 > div > div > div > div > p")).getText();
        Assert.assertTrue(actualResult.contains("Thanks for contacting us, we will get back to you shortly."));




    }










}
