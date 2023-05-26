package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() Sayfa Basligini verir.
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("Amazon Window Handle Degeri : "+amazonWindowHandle);//73AEFEDF1EEE2F5E0069DAD21561F4F1

        driver.get("http://techproeducation.com");
        System.out.println("Techproed Actual Title : "+driver.getTitle());//getTitle() methodu Sayfa basligini verir.

        //getCurrentUrl() Gidilen sayfanin Url'ini verir.
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());

        //getPageSource() Acilan sayfanin kaynak kodlarini verir.
        //System.out.println(driver.getPageSource()); Bilerek yoruma aldik. Her calistirdigimiz da konsola butun kaynak kodlarini verecegi icin

        //getWindowHandle() Gidilen sayfanin handle degerini (hashKod) verir. Bu handle degerini sayfalar arasi gecis icin kullaniriz.
        System.out.println("Techproed Window Handle Degeri : "+driver.getWindowHandle());//43553FC1F76A3528C609F544D51B13FE


    }
}
