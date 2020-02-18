package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdefinition {

    public static WebDriver driver = null;
    public Webdriverdefinition()
    {
        if(driver == null)
        {
            //Mention path of chrome driver of your system
            String exePath = "./home/nilushi/Documents/chatbot/seleniumTestrunJenkins/libs/chromedriver";
            System.setProperty("webdriver.chrome.driver", exePath);
            driver = new ChromeDriver();
            System.out.println("**Chrome driver initiated**");
        }
        else
        {
            System.out.println("**Chrome driver already instantiated**");
        }
    }
    public static WebDriver getdriver()
    {
        if (driver == null){
            return driver;
        }else{
            return driver;
        }
    }
}
