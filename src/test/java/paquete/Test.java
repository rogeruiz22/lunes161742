package paquete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    @org.testng.annotations.Test
    public void hacerLogin() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.quit();
    }
}
