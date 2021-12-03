package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\IdeaProjects\\gittigidiyor-selenium-test\\src\\driver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver=new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");
    }


    @After
    public void close(){
        driver.quit();
    }
}
