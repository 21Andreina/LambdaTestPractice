package pages;

import net.bytebuddy.dynamic.TypeResolutionStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
   //Single Checkbox Demo
    @FindBy (id= "isAgeSelected")
    private WebElement singleCheckbox;
    public void clickOnSingleCheckbox(){singleCheckbox.click();}

    //Disabled Checkbox Demo
    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input")
    private WebElement CheckboxOption1;
    public void clickOnCheckboxOption1(){CheckboxOption1.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input")
    private WebElement CheckboxOption2;
    public void clickOnCheckboxOption2(){CheckboxOption2.click();}


   //MultipleCheckboxDemo
    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input")
    private WebElement MultipleCheckboxDemoOption1;
    public void clickOnMultipleCheckboxDemoOption1(){MultipleCheckboxDemoOption1.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/input")
    private WebElement MultipleCheckboxDemoOption2;
    public void clickOnMultipleCheckboxDemoOption2(){MultipleCheckboxDemoOption2.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/input")
private WebElement MultipleCheckboxDemoOption3;
    public void clickOnMultipleCheckboxDemoOption3(){MultipleCheckboxDemoOption3.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input")
    private WebElement MultipleCheckboxDemoOption4;
    public void clickOnMultipleCheckboxDemoOption4(){MultipleCheckboxDemoOption4.click();}

    @FindBy (css = "#box")
    private WebElement CheckAllButton;
    public void clickOnCheckAllButton(){CheckAllButton.click();}



}



