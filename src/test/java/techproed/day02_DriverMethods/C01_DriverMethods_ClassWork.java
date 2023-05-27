package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //Sayfa basliginin Amazon icerdigini test edelim.
        String actualTitle = driver.getTitle();
        String axpectedTitle = "Amazon";
        if (actualTitle.contains(axpectedTitle)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

        //Url'in https://www.amazon.com/ oldugunu test edelim

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualUrl);

        //Sayfayi kapatalim.
        driver.close(); // Browser'i kapatir.
        //driver.quit();-> Birden fazla browser varsa hepsini kapatir.

    }

}