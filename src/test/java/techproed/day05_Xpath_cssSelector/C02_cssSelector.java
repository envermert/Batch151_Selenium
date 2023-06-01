package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        /*
        cssSelector ile xpath arasindaki farklar;
        1- cssSelector'de @ isareti ve // isaretleri kullanilmaz
        2- xpath ile index alabiliriz ama cssSelector ile index alamayiz
        3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayiz
        4- cssSelector xpath'e gore daha hizli calisir
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        Thread.sleep(3000);
        addElementButton.click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
       // System.out.println(deleteButton.isDisplayed());

        if (deleteButton.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //Delete tusuna basin
            deleteButton.click();
            Thread.sleep(2000);

        //Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElements.isDisplayed()){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //Sayfayi kapatiniz
        driver.close();

    }

}
