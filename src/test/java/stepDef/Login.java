package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Login {


    WebDriver driver; // set driver for test using webdriver from selenium
    String baseUrl = "https://www.saucedemo.com/"; //set base url

    new*
    @Given("User is on SauceDemo login page")
    public void user_is_on_sauce_demo_login_page(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver automatically using web driver manager
        ChromeOptions opt = new ChromeOptions(); // create object to setup option for chrome driver
        opt.setHeadless(false); // set chrome driver to not using headless mode

        driver = new ChromeDriver (opt); // apply chrome driver setup to driver
        driver.manage().timeouts().implicitLyWait( time: 60, TimeUnit.SECONDS); //set timeout for web driver on waiting element
        driver.manage().window().maximize(); // maximize window
        driver.get(baseUrl); // access base url
    }

    new*
    @When("user input standard_user as Username$")
    public void user_input_standard_user_as_username(String username){
        driver.findElement(By.id("username")).sendKeys(username);

    }
    new*
    @And("user input secret_sauce as Password$")
    public void user_input_secret_sauce_as_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    new*
    @And("user click login")
    public void user_click_login(){
        driver.findElement(By.xpath(xpathExpression: "button[@type='login']")).click();
    }
    new*
    @Then("user login result$")
    public void user_success_login_result(String status){
        if (status.equals("success")){ //assert success login
            driver.findElement(By.xpathExpression: "//div[contains(text(), 'dashboard')]"));
            Assert.assertEquals((username, actual: "tdd-selenium");
        }else {//assert error message
            String errorLogin - driver.findElement(By.xpathExpression: "//div[@role='alert']")).getText();
            Assert.assertEquals(errorLogin, actual: "Username and password do not match any user in this service");
    }
}

}


