package paquete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EntrarSalesforce {
    public Object salesforceLogin;

    @Test
    public static void salesforceLogin() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.quit();
    }
}
