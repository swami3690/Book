/**import org.openqa.selenium.By;

import static java.lang.Double.parseDouble;

public class Practice {


    //driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
    //driver.manage().wait(7000);
    // Add to Cart

    //driver.findElement(By.linkText("Add to cart")).click();

    //Pass or failed
    String actualM2 = driver.findElement
    String expectedM2 = "$700.00 - $3,000.00";
    String s[] = expectedM2.split("-");
    String s4 = s[1].replaceAll(" ", "").replace("$", "").replace("," , "");
    String s3 = s[0].replace("$", "");
    //Convert String to Double
    double p1 = parseDouble(s3);
    double p2 = parseDouble(s4);
    //Converting Actual value to double
    double AM2 = parseDouble(actualM2.replace("$", "").replace(",", ""));

    //assertThat(AM2).isBetween(p1, p2);

    //assertTrue(AM2).isBetween(p1,p2));

}

 */