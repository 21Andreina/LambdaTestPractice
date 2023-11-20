package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.w3c.dom.html.HTMLInputElement;

public class SimpleFormPage extends BasePage {
    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id="showInput")
    private WebElement getCheckedValueButton;
    public void clickOnGetCheckedValueButton() {
        getCheckedValueButton.click();
    }

    @FindBy (id="message")
    private WebElement checkMessage;
    public void checkYourMessage() {
        checkMessage.getText();
    }





    @FindBy (id = "sum1")
private WebElement EnterFirstValue;
    public void EnterTextInFirstValue(String Value) {EnterFirstValue.sendKeys(Value);}


    @FindBy (id = "sum2")
    private WebElement EnterSecondValue;
    public void EnterTextInSecondValue(String Value) {EnterSecondValue.sendKeys(Value);}

    @FindBy (css = "#gettotal > button")
    private WebElement GetSum;
    public void clickOnGetSumButton() {GetSum.click();}

    @FindBy (id = "addmessage")
    private WebElement checkResult;
    public void checkResult() {
        checkResult.getText();
    }
    }


