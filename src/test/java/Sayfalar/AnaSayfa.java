package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnaSayfa extends Sayfa{

    private String elementXpath;

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }

    public final String projeLink = "//a[.='Projects']";

    public final String aramaButonu = "q";



}
