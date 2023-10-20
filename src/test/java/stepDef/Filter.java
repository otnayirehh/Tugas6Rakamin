package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Filter {


    WebDriver driver; // set driver for test using webdriver from selenium
    String baseUrl = "https://www.saucedemo.com/"; //set base url

    new*
    @Given("User is on SauceDemo Main page")
    public void user_is_on_sauce_demo_main_page(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver automatically using web driver manager
        ChromeOptions opt = new ChromeOptions(); // create object to setup option for chrome driver
        opt.setHeadless(false); // set chrome driver to not using headless mode

        driver = new ChromeDriver (opt); // apply chrome driver setup to driver
        driver.manage().timeouts().implicitLyWait( time: 60, TimeUnit.SECONDS); //set timeout for web driver on waiting element
        driver.manage().window().maximize(); // maximize window
        driver.get(baseUrl); // access base url
    }

    new*
    @When("user click filter as Filter$")
    public void user_click_filter_as_filter(String filter){
        driver.findElement(By.id("filter")).sendKeys(filter);

    }
    new*
    @And("user input lowtohigh as price$")
    public void user_input_lowtohigh_as_price(String price) {
        driver.findElement(By.id("price")).sendKeys(price);
    }
    new*
    @And("user click apply")
    public void user_click_apply(){
        driver.findElement(By.xpath(xpathExpression: "button[@type='apply']")).click();
    }
    new*
    @Then("user price result$")
    public void user_success_filter_result(String status){
        if (status.equals("success")){ //assert success filter
            driver.findElement(By.xpathExpression: "//div[contains(text(), 'main page')]"));
            Assert.assertEquals((filter, actual: "tdd-selenium");
        }else {//assert error message
            String errorFilter - driver.findElement(By.xpathExpression: "//div[@role='alert']")).getText();
            Assert.assertEquals(errorFilter, actual: "filter failed in this service");
    }
}

}


