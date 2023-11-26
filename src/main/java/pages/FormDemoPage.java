package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormDemoPage extends BasePage {
    public FormDemoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "name")
    private WebElement NameField;
    public void typeNameInNameField(String text){ NameField.sendKeys(text);
    }

    @FindBy (id = "inputEmail4")
    private  WebElement EmailField;
    public void typeEmailInEmailField(String text){EmailField.sendKeys(text);}

    @FindBy (id = "inputPassword4")
    private WebElement PasswordField;
    public void typePasswordInPasswordField(String text){PasswordField.sendKeys(text);}

    @FindBy (id = "company")
    private WebElement CompanyField;
    public void typeCompanyInCompanyField(String text){CompanyField.sendKeys(text);}

    @FindBy (id = "websitename")
    private WebElement WebsiteField;
    public void typeWebsiteInWebsiteField(String text){WebsiteField.sendKeys(text);}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div/form/div[3]/div[1]/select")
    private WebElement ChooseACountry;
    public void clickOnChooseACountry(){ChooseACountry.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div/form/div[3]/div[1]/select/option[184]")
    private WebElement ChooseRomania;
    public void clickOnRomaniaCountry(){ChooseRomania.click();}

    @FindBy (id = "inputCity")
    private WebElement CityField;
    public void typeCityInCityField(String text){CityField.sendKeys(text);}

    @FindBy (id = "inputAddress1")
    private WebElement Address1Field;
    public void typeAddressInAddres1Field(String text){Address1Field.sendKeys(text);}

    @FindBy (id = "inputAddress2")
    private WebElement Address2Field;
    public void typeAddressInAddress2Field(String text){Address2Field.sendKeys(text);}

    @FindBy(id = "inputState")
    private WebElement StateField;
    public void typeStateinStateField(String text){StateField.sendKeys(text);}

    @FindBy (id = "inputZip")
    private WebElement ZipCodeField;
    public void typeZipInZipCodeField(String text){ZipCodeField.sendKeys(text);}

    @FindBy (css = "#seleniumform > div.text-right.mt-20 > button")
    private WebElement SubmitButton;
    public void clickOnSubmitButton(){SubmitButton.click();}

    @FindBy (css = "#__next > div > section.mt-50 > div > div > div > div > p")
    private WebElement SubmitMessage;
    public String getASubmitMessage (){return SubmitMessage.getText();}



}
