package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class C01_IlkTest {

    public static void main(String[] args) {

        //WebDriver driver =new SafariDriver();

        WebDriver driver=new ChromeDriver();
        driver.get("https://techproeducation.com"); //get() methodu ile String olarak girilen url'e gideriz.
    }
}
