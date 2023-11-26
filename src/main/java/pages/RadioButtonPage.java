package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //Click on button to get the selected value.
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input")
    private WebElement clickOnMaleRadioButton;

    public void clickOnMaleRadioButton() {clickOnMaleRadioButton.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]/input")
    private  WebElement clickOnFemaleButton;
        public void  clickOnFemaleButton(){clickOnFemaleButton.click();
    }
    @FindBy (id= "buttoncheck")
    private WebElement clickOnGetValueButton;
        public void clickOnGetValueButton(){clickOnGetValueButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]")
    private WebElement getSelectedMaleMessage;
        public String getSelectedMaleMessage(){return getSelectedMaleMessage.getText();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]")
    private WebElement getSelectedFamaleMessage;
        public String getSelectedFemaleMessage(){return getSelectedFamaleMessage.getText();}


    //Disabled Radio Button
    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[1]/label/input")
    private WebElement clickOnRadioButton1;
        public void clickOnRadioButton1(){clickOnRadioButton1.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input")
    private WebElement clickOnRadioButton2;
        public void clickOnRadioButton2(){clickOnRadioButton2.click();}



    //Click on button to get the selected values from Gender and Age
    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input")
    private WebElement clickOnMaleGenderButton;
        public void clickOnMaleGenderButton(){clickOnMaleGenderButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input")
    private WebElement clickOnFemaleGenderButton;
        public void clickOnFemaleGenderButton(){clickOnFemaleGenderButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input")
    private WebElement clickOnOtherGenderButton;
        public void clickOnOtherGenderButton(){clickOnOtherGenderButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")
    private WebElement clickOn0To5AgeCategoryButton;
        public void setClickOn0To5AgeCategoryButton(){clickOn0To5AgeCategoryButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input")
    private WebElement clickOn5To15AgeCategoryButton;
        public void setClickOn5To15AgeCategoryButton(){clickOn5To15AgeCategoryButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input")
    private WebElement clickOn15To50AgeCategoryButton;
        public void setClickOn15To50AgeCategoryButton(){clickOn15To50AgeCategoryButton.click();}

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")
    private WebElement clickOnGetValueButton2;
        public void setClickOnGetValueButton2(){clickOnGetValueButton2.click();}



}

