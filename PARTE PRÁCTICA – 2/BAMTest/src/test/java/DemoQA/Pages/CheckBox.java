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

public class CheckBox {

    private WebDriver driver;
    private ButtonPages Buttonpages ;



    public CheckBox(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.Buttonpages =new ButtonPages(driver);
    }

    @FindBy(how = How.XPATH, using = "//li[2]/span")
    private WebElement Checkbox;

        @FindBy(how = How.XPATH, using = ("(//*[@class='rct-icon rct-icon-expand-all'])[1]"))
        private WebElement Mas;

    @FindBy(how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Classified'])[1]/following::*[name()='svg'][1]")
    private WebElement General;

    @FindBy(how = How.XPATH, using = ("//span[normalize-space()='Radio Button']"))
    private WebElement RadioButton;

    @FindBy(how = How.XPATH, using = ("//label[normalize-space()='Yes']"))
    private WebElement yes;
    @Step
    public  void  Box_general   () throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Buttonpages.scrollSubir();
        wait.until(ExpectedConditions.visibilityOf(Checkbox));
        Checkbox.click();
        wait.until(ExpectedConditions.elementToBeClickable(Mas));
        Mas.click();
        js.executeScript("arguments[0].scrollIntoView();", General);
        General.click();


    }
}
