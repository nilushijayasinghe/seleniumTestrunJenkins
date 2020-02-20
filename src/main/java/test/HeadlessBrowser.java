package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

    public static WebDriver driver = null;
    public HeadlessBrowser()
    {
        if(driver == null)
        {
            System.setProperty("webdriver.chrome.driver","/home/nilushi/Documents/chatbot/seleniumTestrunJenkins/libs/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox"); //Bypass OS security model
            options.addArguments("--start-maximized");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
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

