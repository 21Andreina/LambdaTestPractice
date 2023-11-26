import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.KeyPressPage;

public class KeyPressTests extends BasePage {
    private KeyPressPage KeyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press");

     @BeforeMethod
    public void setUp(){
         super.setUp();
         KeyPressPage = new KeyPressPage(driver);
     }

     @Test
    public void typeInALetterAndCheckTheResult(){
         driver.findElement(KEY_PRESS_LINK_TEXT).click();
         KeyPressPage.typeInTheTextField("R");

         String actualResult = driver.findElement(By.id("result")).getText();
         Assert.assertTrue(actualResult.contains("R"));
     }
     @Test
    public void typeShiftKeyAndCheckTheResult(){
         driver.findElement(KEY_PRESS_LINK_TEXT).click();
         KeyPressPage.typeInShiftKey();

         String actualResult = driver.findElement(By.id("result")).getText();
         Assert.assertTrue(actualResult.contains("SHIFT"));
     }

     @Test
    public void typeEnterKeyAndCheckTheResult(){
         driver.findElement(KEY_PRESS_LINK_TEXT).click();
         KeyPressPage.typeInEnterKey();

         String actualResult = driver.findElement(By.id("result")).getText();
         Assert.assertTrue(actualResult.contains("ENTER"));
     }
     @Test
    public void typeControKeyAndCheckTheResult(){
         driver.findElement(KEY_PRESS_LINK_TEXT).click();
         KeyPressPage.typeInControlKey();

         String actualResult = driver.findElement(By.id("result")).getText();
         Assert.assertTrue(actualResult.contains("CONTROL"));
     }

     @Test
    public void typeAltKeyAndCheckTheResult(){
         driver.findElement(KEY_PRESS_LINK_TEXT).click();
         KeyPressPage.typeInAltKey();

         String actualResult = driver.findElement(By.id("result")).getText();
         Assert.assertTrue(actualResult.contains("ALT"));

     }
     @Test
    public void typeBackspaceKeyAndCheckTheResult(){
         driver.findElement(KEY_PRESS_LINK_TEXT).click();
         KeyPressPage.typeInBackspaceKey();

         String actualResult = driver.findElement(By.id("result")).getText();
         Assert.assertTrue(actualResult.contains("BACK_SPACE"));
     }











}
