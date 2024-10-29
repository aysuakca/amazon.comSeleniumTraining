package testCase4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testAddToCart {
    @Test

    public void testaAddToChartProducts(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com.tr/");

        WebElement homeLogo = driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
        Assert.assertTrue(homeLogo.isDisplayed());

        WebElement cookies = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        cookies.click();

        WebElement products = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
        products.click();

        WebElement bestSellers = driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']"));
        bestSellers.click();

        WebElement garden = driver.findElement(By.xpath("//a[@href='/gp/bestsellers/garden/ref=zg_bs_nav_garden_0']"));
        garden.click();

        WebElement xiaomi = driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/I/41N1IH9jwoL._AC_UL600_SR600,400_.jpg']"));
        xiaomi.click();

        WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        cart.click();

        WebElement goCart = driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']"));
        goCart.click();

        driver.quit();
    }
}
