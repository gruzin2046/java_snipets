package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleSeleSele {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.home")+"/tools/webdrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");

        // pobranie tytułu strony (opis w zakładce)
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.close();
    }
}
