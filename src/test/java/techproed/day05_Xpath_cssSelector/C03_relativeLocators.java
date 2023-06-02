package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativeLocators {
    /*
    Benzer ozellikllere sahip webelementler icin relative locator kullanabiliriz.
    SYNTAX;
    driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near()) gibi
    methodlar ile benzer ozelliklere sahip webelementleri locatini almadan o web elemente ulasabiliriz.
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon'a gidelim
        driver.get("https://amazon.com");

        //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //relative locator kullanarak hybrid bikes altindaki elemente tiklayalim.
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        electricBike.click();
        driver.navigate().back();
        WebElement compliteBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        compliteBike.click();








    }
}
