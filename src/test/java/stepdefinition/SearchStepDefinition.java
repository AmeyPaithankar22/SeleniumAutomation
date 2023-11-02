package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {

	public static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrom.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
		driver.findElement(By.linkText("Qafox.com"));
	}

	@When("user searches {string} in search field")
	public void user_searches_in_search_field(String product) {
		driver.findElement(By.name("search")).sendKeys(product);
	}

	@When("click Search")
	public void click_Search() {
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
	}

	@Then("user should see {string}")
	public void user_should_see_product(String product) {
		driver.findElement(By.xpath("//a[text()='"+product+"']"));
	}
	
	@After
	public void close() {
		driver.quit();
	}
	
}
