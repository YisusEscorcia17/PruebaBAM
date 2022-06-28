package DemoQA.Pages;

import DemoQA.Steps.ButtonPages;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class WebTables {

    private WebDriver driver;
    private ButtonPages Buttonpages;


    public WebTables(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.Buttonpages = new ButtonPages(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Web Tables']")
    private WebElement tablas;

    @FindBy(how = How.XPATH, using = "//*[@id='delete-record-1']")
    private WebElement Borrar_registro1;




    @Step
    public void Eliminar_Registro() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(tablas));
        tablas.click();
        wait.until(ExpectedConditions.elementToBeClickable(Borrar_registro1));
        Borrar_registro1.click();

    }
}
