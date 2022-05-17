package paquete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EntrarSalesforce {

    @Test
    public static void hacerLogin() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.quit();
    }
}
