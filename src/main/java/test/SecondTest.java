package test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SecondTest extends HeadlessBrowser{

    @Test
    public void successfulLogin() throws Exception{

        driver.get("http://192.168.86.51:802/admin/login.jsf");

        driver.findElement(By.xpath("//input[@id='j_idt13:j_idt18']")).sendKeys("superuser");

        driver.findElement(By.xpath("//input[@id='j_idt13:j_idt21']")).sendKeys("123456");

        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//img[@id='j_idt17']")).click();

        driver.findElement(By.xpath("//a[@id='j_idt22:j_idt23']")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception{
        driver.quit();
    }


}
