package Class28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E10Finally {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
                try{
                    driver.get("https://google.com");
                    driver.findElement(By.xpath("dsksksk"));
                }finally{
                    driver.close();
                }



    }
}
