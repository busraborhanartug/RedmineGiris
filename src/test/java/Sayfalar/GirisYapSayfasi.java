package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{
    public final String kullaniciAdi = "username";

    public final String sifre = "password";

    public final String girisButon = "login-submit";

    public final String projeLink = "//a[.='Projects']";

    public final String projeLinkCss = "[href='/projects']";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
