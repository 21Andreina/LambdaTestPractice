package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id= "my_field")
    private WebElement textField;
    public void typeInTheTextField(String text) {
        textField.sendKeys(text);
    }
    public void typeInShiftKey() {
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).perform();
    }
    public void typeInEnterKey(){
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.ENTER).perform();
    }
    public void typeInControlKey(){
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).perform();
    }
    public void typeInAltKey(){
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.ALT).perform();
    }
    public void typeInBackspaceKey(){
        textField.click();
        Actions action = new Actions(driver);
        action.keyDown(Keys.BACK_SPACE).perform();
    }



}
