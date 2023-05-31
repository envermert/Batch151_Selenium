package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //https://www.amazon.com sayfasina gidiniz
        driver.get("https://www.amazon.com");

        //arama kutusunu locate ediniz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusunun tagName'inin "input" oldugunu test edin
        String actuelTagname = aramaKutusu.getTagName();
        String expectedTagname = "input";

        if (actuelTagname.equals(expectedTagname)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }


        //arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
        String actuelAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";

        if (actuelAttribute.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //sayfayi kapatin
        driver.close();

    }
}
