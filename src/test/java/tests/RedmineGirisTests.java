package tests;

import Sayfalar.AnaSayfa;
import Sayfalar.GirisYapSayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RedmineGirisTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        driver.get("https://redmine.bites.com.tr/");
    }
    @Test
    void redmineLoginTesti(){
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.kullaniciAdi);
        girisYapSayfasi.tusaBas(girisYapSayfasi.kullaniciAdi);
        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.kullaniciAdi, "busra.artug");
        //girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.sifre);
        girisYapSayfasi.tusaBas(girisYapSayfasi.sifre);
        girisYapSayfasi.alanaSifreYaz(girisYapSayfasi.sifre,"********" );
        //girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisButon);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisButon);



        
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.projeLink);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        anaSayfa.tusaBasXpath(anaSayfa.projeLink);
    }
    //@AfterEach
    //void tearDown(){
    //    driver.close();
    //}
}
