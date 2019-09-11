import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstAuto {



        protected static WebDriver driver;
        @Before
        public void openBrowser(){
            System.setProperty("webdriver.chrome.driver", "src\\main\\Resorces\\BrowserDriver\\chromedriver.exe");

            // open the browser
            driver = new ChromeDriver();
            // maximise the briwser window screen
            driver.manage().window().fullscreen();
            //set implicity wait for driver object
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://demo.nopcommerce.com/");
        }
        @Test

        public void registerSuccessfully(){
            // open the wbsite
            //driver.get("https://demo.nopcommerce.com/");
            //click on register button
            driver.findElement(By.xpath("//a[@class='ico-register']")).click();
            //enter first name
            driver.findElement(By.id("FirstName")).sendKeys("venus");
            //enter lastname
            driver.findElement(By.xpath("// input[@name= 'LastName']")).sendKeys("patel");
            //enter email
            driver.findElement(By.name("Email")).sendKeys("testtest.com");

            driver.findElement(By.name("Email")).sendKeys("testtest22@test.com");
            driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("swami1234");
            driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("swami1234");
            driver.findElement(By.xpath("//input[@value= \"Register\" ]")).click();


        }

        @Test
        public void emailAFriend(){
            // open the wbsite
            driver.get("https://demo.nopcommerce.com/");
            //click on login
            driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();


            driver.findElement(By.name("Email")).sendKeys ("testtest1@test.com");
            driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys( "abcd1234");
            driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
            //click on mac product

            driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
            //Email to friend
            driver.findElement(By.xpath("//div[@ class=\"email-a-friend\" ]")).click();
            //enter a friend email

            driver.findElement(By.id("FriendEmail")).sendKeys("arpi.shah09@gmial.com");
//enter a personal email
            driver.findElement(By.xpath("//textarea[@id=\"PersonalMessage\" ]")).sendKeys("Good deal I think please have a  look");

            driver.findElement(By.xpath("//input [@ value=\"Send email\" ]")).click();

        }

@Test
public void orangeLogin() {


    // open the wbsite
    driver.get("https://opensource-demo.orangehrmlive.com");
//add username
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");

//add password
    driver.findElement(By.xpath("//input[@ name=\"txtPassword\"]")).sendKeys("admin123");
//click on login

    driver.findElement(By.id("btnLogin")).click();




}


      @After
    public void closeBrowser(){
          driver.quit();
      }


        }
