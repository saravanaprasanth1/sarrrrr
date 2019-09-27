package casestudy1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	WebDriver driver;
	@Before
	public void a()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
System.out.println("before Scenario");

	}
	@After
	public void b()
	{
		System.out.println("After Scenario");
		driver.close();
	}
@Given("Enter the url {string}")
public void c(String string) {
driver.get(string);
}

@When("username {string}")
public void d(String string) {
	driver.findElement(By.id("userName")).sendKeys(string);

}
@When("firstname {string}")
public void e(String string) {
	driver.findElement(By.id("firstName")).sendKeys(string);


}@When("lastname {string}")
public void f(String string) {
	driver.findElement(By.id("lastName")).sendKeys(string);


}
@When("password {string}")
public void g(String string) {
	driver.findElement(By.id("password")).sendKeys(string);


}
@When("confirmpassword {string}")
public void h(String string) {
	driver.findElement(By.id("pass_confirmation")).sendKeys(string);


}
@When("gender")
public void i() {
	driver.findElement(By.xpath("//input[@id='gender' and@value='Female']")).click();


}
@When("email {string}")
public void j(String string) {
	
	  driver.findElement(By.id("emailAddress")).sendKeys(string);

}
@When("mobileno {string}")
public void k(String string) {

	  driver.findElement(By.id("mobileNumber")).sendKeys(string);

}
@When("dob {string}")
public void l(String string) {
	  driver.findElement(By.id("dob")).sendKeys(string);


}
@When("address {string}")
public void m(String string) {
	  driver.findElement(By.id("address")).sendKeys(string);


}

@When("answer {string}")
public void o(String string) {
	
	  driver.findElement(By.id("answer")).sendKeys(string);

}
@Then("register ")
public void p()
{
	  driver.findElement(By.name("Submit")).click();

}

@When("user enter {string} as username")
public void q(String string) {
	

}
@When("user enter {string} as password")
public void r(String string) {
	

}
@Then("user Logins to Testmeapp")
public void s() {
	driver.findElement(By.linkText("Login")).click();
	
}
}
