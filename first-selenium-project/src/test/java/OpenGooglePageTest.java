import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGooglePageTest {
FirefoxDriver driver;

@BeforeMethod
    public void setUp(){
    driver = new FirefoxDriver();
}

@Test
    public  void testOpeningGooglePage(){
   // driver.get("https://www.google.com/");
    driver.navigate().to("https://www.google.com/");

    driver.findElement(By.name("q")).sendKeys("Webdriver");
}

@Test
public void test(){
    driver.get("https://trello.com/");
   // driver.findElement(By.linkText("Log in.")).click();
    driver.findElement(By.xpath("//*[@href='/login']")).click();
}


@AfterMethod
    public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
}


}
