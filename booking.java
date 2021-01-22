package feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Selenium.CaseStudyAssignment.globalDriver;


@RunWith(Cucumber.class)


public class booking extends globalDriver{

	
		
	  //User already on Hotel Booking Form page
}

@When("^User clicking on Confirm Booking without providing First Name$")
public void user_clicking_on_confirm_booking_without_providing_first_name() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();

}

@When("^User clicking on Confirm Booking without providing Last Name$")
public void user_clicking_on_confirm_booking_without_providing_last_name() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill the First Name alert message should populate$")
public void please_fill_the_first_name_alert_message_should_populate() throws Throwable {
	String alertmsg1=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg1);
	driver.switchTo().alert().accept();
}

@Then("^Please fill the Last Name alert message should populate$")
public void please_fill_the_last_name_alert_message_should_populate() throws Throwable {
	String alertmsg2=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg2);
	driver.switchTo().alert().accept();
}

@And("^Enter First Name as \"([^\"]*)\"$")
public void enter_first_name_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtFirstName")).sendKeys(strArg1);
}

@And("^Enter Last Name as \"([^\"]*)\"$")
public void enter_last_name_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtLastName")).sendKeys(strArg1);
}

@When("^User clicking on Confirm Booking with providing wrong email format as \"([^\"]*)\"$")
public void user_clicking_on_confirm_booking_with_providing_wrong_email_format_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtEmail")).sendKeys("mohan.gond");
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill the Email alert message should populate$")
public void please_fill_the_email_alert_message_should_populate() throws Throwable {
	String alertmsg4=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg4);
	driver.switchTo().alert().accept();
}

@And("^Enter Email as \"([^\"]*)\"$")
public void enter_email_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtEmail")).clear();
	driver.findElement(By.id("txtEmail")).sendKeys("mohangond06@gmail.com");
}

@When("^User clicking on Confirm Booking without providing Mobile no$")
public void user_clicking_on_confirm_booking_without_providing_mobile_no() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill the Mobile No alert message should populate$")
public void please_fill_the_mobile_no_alert_message_should_populate() throws Throwable {
	String alertmsg5=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg5);
	driver.switchTo().alert().accept();
}

@When("^User clicking on Confirm Booking with providing Mobile no doesn’t start with either 7,8 or 9 and doesn’t have 10 digits$")
public void user_clicking_on_confirm_booking_with_providing_mobile_no_doesnt_start_with_either_78_or_9_and_doesnt_have_10_digits() throws Throwable {
	driver.findElement(By.id("txtPhone")).sendKeys("123456");
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please enter valid Contact no alert message should populate$")
public void please_enter_valid_contact_no_alert_message_should_populate() throws Throwable {
	String alertmsg6=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg6);
	driver.switchTo().alert().accept();
}

@And("^Enter Mobile No. as \"([^\"]*)\"$")
public void enter_mobile_no_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtPhone")).clear();
	driver.findElement(By.id("txtPhone")).sendKeys("9448528161");
}

@When("^User enter address details as \"([^\"]*)\"$")
public void user_enter_address_details_as_something(String strArg1) throws Throwable {
	driver.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys(strArg1);
}

@Then("^validate Address details$")
public void validate_address_details() throws Throwable {
   // Address added successfully
}

@When("^User clicking on Confirm Booking without selecting City$")
public void user_clicking_on_confirm_booking_without_selecting_city() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please select city alert message should populate$")
public void please_select_city_alert_message_should_populate() throws Throwable {
	String alertmsg7=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg7);
	driver.switchTo().alert().accept();
}

@And("^Select City using static dropdown$")
public void select_city_using_static_dropdown() throws Throwable {
	WebElement s1=driver.findElement(By.name("city"));
	Select d1=new Select(s1);
	d1.selectByIndex(2);
}

@When("^User clicking on Confirm Booking without selecting Sate$")
public void user_clicking_on_confirm_booking_without_selecting_sate() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please select State alert message should populate$")
public void please_select_state_alert_message_should_populate() throws Throwable {
	String alertmsg8=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg8);
	driver.switchTo().alert().accept();
}

@And("^Select State using static dropdown$")
public void select_state_using_static_dropdown() throws Throwable {
	WebElement s2=driver.findElement(By.name("state"));
	Select d2=new Select(s2);
	d2.selectByIndex(2);
}

@When("^User select Number of guest staying using static dropdown$")
public void user_select_number_of_guest_staying_using_static_dropdown() throws Throwable {
	WebElement s3=driver.findElement(By.name("persons"));
	Select d3=new Select(s3);
	d3.selectByVisibleText("5");
}

@Then("^Number of guest staying successfully selected$")
public void number_of_guest_staying_successfully_selected() throws Throwable {
   //Number of guest staying successfully selected
}

@When("^User clicking on Confirm Booking without providing Card Holder Name$")
public void user_clicking_on_confirm_booking_without_providing_card_holder_name() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill the Card holder name alert message should populate$")
public void please_fill_the_card_holder_name_alert_message_should_populate() throws Throwable {
	String alertmsg9=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg9);
	driver.switchTo().alert().accept();
}

@And("^Enter Card Holder Name as \"([^\"]*)\"$")
public void enter_card_holder_name_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtCardholderName")).sendKeys(strArg1);
}

@When("^User clicking on Confirm Booking without providing Debit Card Number$")
public void user_clicking_on_confirm_booking_without_providing_debit_card_number() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill the Debit card Number alert message should populate$")
public void please_fill_the_debit_card_number_alert_message_should_populate() throws Throwable {
	String alertmsg10=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg10);
	driver.switchTo().alert().accept();
}

@And("^Enter Debit Card Number as \"([^\"]*)\"$")
public void enter_debit_card_number_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtDebit")).sendKeys(strArg1);
}

@When("^User clicking on Confirm Booking without providing CVV$")
public void user_clicking_on_confirm_booking_without_providing_cvv() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill the CVV alert message should populate$")
public void please_fill_the_cvv_alert_message_should_populate() throws Throwable {
	String alertmsg11=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg11);
	driver.switchTo().alert().accept();
}

@And("^Enter CVV as \"([^\"]*)\"$")
public void enter_cvv_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtCvv")).sendKeys("123");
}

@When("^User clicking on Confirm Booking without providing Expiration month$")
public void user_clicking_on_confirm_booking_without_providing_expiration_month() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill expiration month alert message should populate$")
public void please_fill_expiration_month_alert_message_should_populate() throws Throwable {
	String alertmsg12=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg12);
	driver.switchTo().alert().accept();
}

@And("^Enter Expiration month as \"([^\"]*)\"$")
public void enter_expiration_month_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtMonth")).sendKeys("20/01/2021");
}

@When("^User clicking on Confirm Booking without providing Expiration Year$")
public void user_clicking_on_confirm_booking_without_providing_expiration_year() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^Please fill expiration year alert message should populate$")
public void please_fill_expiration_year_alert_message_should_populate() throws Throwable {
	String alertmsg13=driver.switchTo().alert().getText();
	System.out.println("alert message is "+alertmsg13);
	driver.switchTo().alert().accept();
}

@And("^Enter Expiration Year as \"([^\"]*)\"$")
public void enter_expiration_year_as_something(String strArg1) throws Throwable {
	driver.findElement(By.id("txtYear")).sendKeys("2022");
}

@When("^User clicking on Confirm Booking$")
public void user_clicking_on_confirm_booking() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^User navigates to success page and capture success message$")
public void user_navigates_to_success_page_and_capture_success_message() throws Throwable {
	String Successmsg=driver.findElement(By.xpath("/html/body/h1")).getText();
	System.out.println("Booking completed success message is "+Successmsg);
}

@And("^Close the window$")
public void close_the_window() throws Throwable {
    driver.quit();
}
}

