package DemoQA.Definitions;



import DemoQA.Pages.CheckBox;
import DemoQA.Pages.RadioButton;
import DemoQA.Pages.TextBox;
import DemoQA.Pages.WebTables;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import DemoQA.Steps.Connection;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class DefinitionsSteps {

	private WebDriver driver;
	private Connection connection;
	private TextBox textBox;
	private CheckBox checkBox;
	private RadioButton radioButton;
	private WebTables webTables;



	@Given("^Abrir el navegador$")
	public void abrir_el_navegador() throws Throwable {
		this.connection = new Connection();
		this.driver = this.connection.openBrowser();
	}
	@When("^textBox$")
	public void textbox() throws Throwable {
		this.textBox = new TextBox(driver);
		textBox.Formulary();
	}

	@Then("^seleccionar Box$")
	public void seleccionar_Box() throws Throwable {
		this.checkBox = new CheckBox(driver);
		checkBox.Box_general();
	}

	@Then("^Seleccionar Radio Button$")
	public void seleccionar_Radio_Button() throws Throwable {
		this.radioButton = new RadioButton(driver);
		this.radioButton.Seleccionar_boton();

	}

	@Then("^eliminar registro$")
	public void eliminar_registro() throws Throwable {
		this.webTables = new WebTables(driver);
		this.webTables.Eliminar_Registro();

	}


}