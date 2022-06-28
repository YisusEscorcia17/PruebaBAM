package DemoQA.Pages;

import DemoQA.Steps.ButtonPages;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

    private WebDriver driver;
    private ButtonPages Buttonpages ;



    public RadioButton(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.Buttonpages =new ButtonPages(driver);
    }


    @FindBy(how = How.XPATH, using = ("//span[normalize-space()='Radio Button']"))
    private WebElement RadioButton;

    @FindBy(how = How.XPATH, using = ("//label[normalize-space()='Yes']"))
    private WebElement yes;
    @Step
    public  void  Seleccionar_boton   () throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Buttonpages.scrollSubir();
        wait.until(ExpectedConditions.elementToBeClickable(RadioButton));
        RadioButton.click();
        yes.click();


    }
}
