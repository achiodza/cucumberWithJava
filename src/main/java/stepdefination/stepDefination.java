package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class stepDefination {
    ChromeDriver driver = new ChromeDriver();
    String username= "John Doe";
    String password= "ThisIsNotAPassword";
    String date = "03/05/2024";
    String comment = "This is a comment";


    @Given("Website link to navigate to")
    public void website_link_to_navigate_to() {
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        
    }

    @Then("Login with Username")
    public void login_with_username() {
        driver.findElement(By.xpath("//*[@id=\"txt-username\"]")).sendKeys(username);
//
        
    }

    @Then("Enter Password")
    public void enter_password() {
        driver.findElement(By.xpath("//*[@id=\"txt-password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        
    }

    @Then("Select the Hong Kong Center")
    public void select_the_hong_kong_center() {

        Select dropdown = new Select(driver.findElement(By.id("combo_facility")));
        dropdown.selectByVisibleText("Hongkong CURA Healthcare Center");
    }

    @Then("Tick the Apply for readmission Option")
    public void tick_the_apply_for_readmission_option() {
        driver.findElement(By.xpath("//*[@id=\"chk_hospotal_readmission\"]")).click();
    }

    @Then("Select none health care program")
    public void select_none_health_care_program() {
        driver.findElement(By.xpath("//*[@id=\"radio_program_none\"]")).click();
    }

    @Then("Enter todays date and a random comment")
    public void enter_todays_date_and_a_random_comment() {
//        send key as date
        driver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]")).sendKeys(date);
    }

    @When("Click on Book Appointment")
    public void click_on_book_appointment() {

        driver.findElement(By.xpath("//*[@id=\"txt_comment\"]")).sendKeys(comment);
        
    }

    @Then("Return and print out the Facility Name")
    public void return_and_print_out_the_facility_name() {

        driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]")).click();
        
    }
}

