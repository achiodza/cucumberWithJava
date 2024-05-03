package base;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class basicCode {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


//        Visit Link
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

//        Enter Username
        String username= "John Doe";
        String password= "ThisIsNotAPassword";
        driver.findElement(By.xpath("//*[@id=\"txt-password\"]")).sendKeys(username);
//        driver.wait(Duration.ofSeconds());
        driver.findElement(By.xpath("//*[@id=\"txt-password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Select dropdown = new Select(driver.findElement(By.id("combo_facility")));
        dropdown.selectByVisibleText("Hongkong CURA Healthcare Center");

        driver.findElement(By.xpath("//*[@id=\"chk_hospotal_readmission\"]")).click();





//        Enter Password

        driver.close();
    }
}
