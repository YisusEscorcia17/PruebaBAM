package DemoQA.Pages;


import DemoQA.Steps.ButtonPages;
import net.thucydides.core.annotations.Step;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
    private WebDriver driver;
    private ButtonPages Buttonpages ;



    public TextBox(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.Buttonpages =new ButtonPages(driver);
    }

    @FindBy(how = How.CSS, using = "path")
    private WebElement Elements;
    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Text Box']")
    private WebElement Text;

    @FindBy(how = How.ID, using = "userName")
    private WebElement userName;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement userEmail;

    @FindBy(how = How.ID, using = "currentAddress")
    private WebElement currentAddress;

    @FindBy(how = How.ID, using = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(how = How.ID, using = "submit")
    private WebElement submit;




    public  void  Formulary () throws Throwable   {
        WebDriverWait wait = new WebDriverWait(driver,30);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Elements);
        wait.until(ExpectedConditions.visibilityOf(Elements));
        Elements.click();
        js.executeScript("arguments[0].scrollIntoView();", Text);
        wait.until(ExpectedConditions.elementToBeClickable(Text));
        Text.click();
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.clear();
        userName.sendKeys("Jesus Escorcia");
        userEmail.clear();
        userEmail.sendKeys("jjesusEscorcia@gmail.com");
        currentAddress.clear();
        currentAddress.sendKeys("Calle 30 # 12 -13");
        permanentAddress.clear();
        permanentAddress.sendKeys("calle 12#30-14");
        js.executeScript("arguments[0].scrollIntoView();", submit);
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();
        Buttonpages.scrollSubir();

    }



    }
