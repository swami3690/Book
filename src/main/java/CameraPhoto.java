import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Double.parseDouble;
import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class CameraPhoto {

    protected static WebDriver driver;

    public String generateEmail(String startValue) {

        String email = startValue.concat(new Date().toString());
        return email;

    }

    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("ddmmyyHummss");
        return format.format(new Date());

    }

 @Before

    public void OpenBrowser() {


        System.setProperty("webdriver.chrome.driver", "src\\main\\Resorces\\BrowserDriver\\chromedriver.exe");

        // open the browser
        driver = new ChromeDriver();
        // maximise the briwser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");


    }

@After
    public void closeBrowser() {
        driver.quit();}

@Test

    public void registerSuccessfully() throws InterruptedException {
        // open the wbsite
        //driver.get("https://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("venus");
        //enter lastname
        driver.findElement(By.xpath("// input[@name= 'LastName']")).sendKeys("patel");
        //enter email
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100000);
        //email random
        driver.findElement(By.name("Email")).sendKeys("testtest" + randomInt + "@gmail.com");
        //password random
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("swami1234");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("swami1234");
        sleep(2000);
        // get Ragister
        driver.findElement(By.xpath("//input[@value= \"Register\" ]")).click();
        //Thread.sleep(70000);
        //After Ragister massage on page
         assertTrue("your register complited ");

        driver.findElement(By.xpath("//div[@class=\"result\" ]")).getText();


    }

    private void assertTrue(String your_register_complited_) {
    }

    private void assertTrue(boolean your_register_completed) {
    }

    @Test

    public void userShouldBeEmailToAFriend() {


        // open the wbsite
        driver.get("https://demo.nopcommerce.com/");
        //click on login
        driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();


        driver.findElement(By.name("Email")).sendKeys("testtest1@test.com");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("abcd1234");
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

    public void electronic() {


           // open the wbsite
           driver.get("https://demo.nopcommerce.com/");

            // click on Electronics

            driver.findElement(By.linkText("Electronics")).click();
            // Click in Camera&photo in Electonics drop box

            driver.findElement(By.linkText("Camera & photo")).click();


    }

@Test

           public void useShouldBeAbleToClickOnJewelry () throws InterruptedException {

           // open the wbsite
           driver.get("https://demo.nopcommerce.com/");

           // click on Jewelry

           driver.findElement(By.linkText("Jewelry")).click();
            sleep(2000);

          //select jwelry 7000-30000

           driver.findElement(By.xpath("//a[contains(@href,'700-3000')]")).click();
            sleep(2000);

        // get expected result and actual result
         String actualM2 = driver.findElement(By.xpath("//span[@class=\"price actual-price\"]")).getText();
         String expectedM2 = "$700.00 - $3,000.00";

          sleep(2000);
         String s[] = expectedM2.split("-");
         String s4 = s[1].replaceAll(" ", "").replace("$", "").replace(",", "");
         String s3 = s[0].replace("$", "");
        //Convert String to Double
         double p1 = parseDouble(s3);
         double p2 = parseDouble(s4);
        //Converting Actual value to double
         double A2 = parseDouble(actualM2.replace("$", "").replace(",", ""));
         sleep(2000);

          assertTrue(A2 > 700 && A2 < 3000);
    }

 @Test

          public void userShouldBeAbleToAddBooksToTheCartSuccessfully () throws InterruptedException {
            //Click in book

            driver.findElement(By.linkText("Books")).click();

            driver.findElement(By.xpath("//input[@type=\"button\" and contains(@onclick, '37/1/1') ]")).click();

             sleep(2000);

             driver.findElement(By.xpath("//input[@type=\"button\" and contains(@onclick, '38/1') ]")).click();

            sleep(7000);
            driver.findElement(By.className("cart-label")).click();

            sleep(10000);
            // actual is should expected
            String actual = driver.findElement(By.xpath("//span[@class =\"sku-number\" and contains( text(),\"FR_451_RB\")] ")).getText();
            String expected = "FR_451_RB";

            Assert.assertArrayEquals(new String[]{actual}, new String[]{expected});

              String actual1 = driver.findElement(By.xpath("//span[@class =\"sku-number\" and contains( text(),\"FIRST_PRP\")] ")).getText();
             String expected1 = "FIRST_PRP";

            Assert.assertArrayEquals(new String[]{actual1}, new String[]{expected1});

            sleep(5000);


        }


    }
























