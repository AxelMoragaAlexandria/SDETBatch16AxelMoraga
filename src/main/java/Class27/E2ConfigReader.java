package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {




        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
                driver.manage().window().maximize();
        String userName= getProperty("userName");
        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        username.sendKeys(userName);
        WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
       String pass= getProperty("password");
        password.sendKeys(pass);
        WebElement login = driver.findElement(By.cssSelector(".button"));
        login.click();

    }

    public static String getProperty(String key) throws IOException {
        FileInputStream file=new FileInputStream(Constant.ConfigReaderPath);
        Properties properties=new Properties();
        properties.load(file);
       return properties.getProperty(key);
    }




}

