import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MavenAlex {
    public static void main(String[] args) throws Exception{

        WebDriver sharelane = new ChromeDriver();

        sharelane.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        sharelane.get("http://www.sharelane.com/");

       WebElement clickEnter = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));
       clickEnter.click();

       WebElement signUp = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
       signUp.click();

       WebElement zipCode = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
       zipCode.sendKeys("99999");

       WebElement zipContinue = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
       zipContinue.click();

       WebElement firstName = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
       firstName.sendKeys("Alex");

      WebElement email = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
      email.sendKeys("alex@mail.ru");

      WebElement password = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
      password.sendKeys("12345");

      WebElement confirmPassword = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
      confirmPassword.sendKeys("12345");

      WebElement register = sharelane.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
      register.click();



       Thread.sleep(10000);
       sharelane.quit();

    }
}
