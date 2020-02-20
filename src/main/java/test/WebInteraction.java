package test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebInteraction extends Webdriverdefinition
{
    @Test(priority=1)
    public void login_OrangeHRM()throws Exception
    {

        getdriver().get("http://192.168.86.51:802/admin/login.jsf");

        getdriver().findElement(By.xpath("//input[@id='j_idt13:j_idt18']")).sendKeys("superuser");

        getdriver().findElement(By.xpath("//input[@id='j_idt13:j_idt21']")).sendKeys("123456");

        getdriver().findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

        getdriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        getdriver().findElement(By.xpath("//img[@id='j_idt17']")).click();

        getdriver().findElement(By.xpath("//a[@id='j_idt22:j_idt23']")).click();

    }

    @Test(priority=2)
    public void loginHRM_GetTitle()
    {
        String Title;
        Title = getdriver().getTitle();
        System.out.print("Title--"+Title);


    }

    @AfterTest(alwaysRun = true)
    public void tearDown()throws Exception{
        driver.quit();
    }
}