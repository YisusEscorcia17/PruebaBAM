package DemoQA.Steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Connection {

	private WebDriver driver;

	@Before
	@Step
	public WebDriver openBrowser() {
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this.driver;

	}

}
