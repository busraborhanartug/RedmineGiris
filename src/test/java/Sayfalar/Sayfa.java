package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;
    private String tusId;
    private String elementXpath;

    public Sayfa (WebDriver driver){
        this.driver = driver;
    }
    public void elementGozukeneKadarBekle(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }
    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
        this.tusId = tusId;
    }
    public void alanaYaziYaz(String elementId, String kullaniciAdi){
        driver.findElement(By.id(elementId)).sendKeys(kullaniciAdi);
    }
    public void alanaSifreYaz(String elementId, String sifre){
        driver.findElement(By.id(elementId)).sendKeys(sifre);
    }

    public void tusaBasCss(String elementCss){
        WebElement projeLinkCss = driver.findElement(new By.ByCssSelector("[href='/projects']"));
    }
    public void alanaSifreYazGizli(String elementId, String sifreGizli) {
        WebElement element = driver.findElement(By.id(elementId));
        // Şifreyi asterisk karakterleriyle doldur
        String gizliSifre = "*".repeat(sifreGizli.length());
        element.sendKeys(gizliSifre);
    }
    public void tusaBasXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

}
