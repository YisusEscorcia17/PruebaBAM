package DemoQA.Steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	private WebDriver driver;

	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		new Questions(driver);

	}
	@Step
	public void scrollSubir() {
		//WebElement continuar = driver.findElement(By.id("continue"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,-350)");
		// js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void scrollbajar() {
		//WebElement continuar = driver.findElement(By.id("continue"));
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,350)");
		// js.executeScript("arguments[0].scrollIntoView();", Element);
	}

}
