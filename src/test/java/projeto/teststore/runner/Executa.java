package projeto.teststore.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import projeto.teststore.drivers.DriversFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features",
	glue = "projeto.teststore.steps",
	tags = "@regressivos",
	dryRun = false ,
	monochrome = true,
	snippets = SnippetType.CAMELCASE,
	plugin = {"pretty","html:target/report-cucumber.html"}
)

public class Executa extends DriversFactory{
	
	public static void iniciarTest() {
		driver = new ChromeDriver();
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		driver.manage().window().maximize();
		
	}
	
	public static void encerrarTest() {
		driver.quit();
		
	}

	
	
}
