
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import Selenium.CaseStudyAssignment.globalDriver;



@RunWith(Cucumber.class)
public class stepDefinitionLogin extends globalDriver{
	
	
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver();
    }

    @And("^Navigate to hotel booking login page \"([^\"]*)\"$")
    public void navigate_to_hotel_booking_login_page_something(String strArg1) throws Throwable {
        driver.get(strArg1);
    }

    @And("^Verify login page heading as Hotel Booking Application$")
    public void verify_login_page_heading_as_hotel_booking_application() throws Throwable {
		String PageHeading=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div/h1")).getText();
		System.out.println("page heading is "+ PageHeading);
    }
    
    @When("^User login into application without providing username and password as \"([^\"]*)\"$")
    public void user_login_into_application_without_providing_username_and_password_as_something(String strArg1) throws Throwable {
		driver.findElement(By.name("userPwd")).sendKeys(strArg1);
		driver.findElement(By.cssSelector(".btn")).click();
    }
    	

	@Then("^Please enter UserName error message should populate$")
	public void please_enter_UserName_error_message_should_populate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String UsernameErrorMsg=driver.findElement(By.id("userErrMsg")).getText();
		System.out.println("Username field error message is "+ UsernameErrorMsg);
		
	}
	   @Given("^User is on hotel booking login page$")
	    public void user_is_on_hotel_booking_login_page() throws Throwable {
	        //user is already in login page
		   driver.findElement(By.name("userPwd")).clear();
		   driver.findElement(By.name("userName")).clear();
	    }
	
	   @When("^User login into application without providing password and username as \"([^\"]*)\"$")
	    public void user_login_into_application_without_providing_password_and_username_as_something(String strArg1) throws Throwable {
		   
			driver.findElement(By.name("userName")).sendKeys(strArg1);
			driver.findElement(By.cssSelector(".btn")).click();
			
	    }

    @Then("^Please enter Password error message should populate$")
    public void please_enter_password_error_message_should_populate() throws Throwable {
		String PasswordErrorMsg=driver.findElement(By.id("pwdErrMsg")).getText();
		System.out.println("Password field error message is "+ PasswordErrorMsg);
		
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		
		driver.findElement(By.name("userName")).sendKeys(strArg1);
		driver.findElement(By.name("userPwd")).sendKeys(strArg2);
		driver.findElement(By.cssSelector(".btn")).click();
    }

    @Then("^Hotel booking page should populate and verify page heading$")
    public void hotel_booking_page_should_populate_and_verify_page_heading() throws Throwable {
		String PageHeading1=driver.findElement(By.xpath("/html/body/div/h2")).getText();
		System.out.println("page heading is "+ PageHeading1);
    }
}

