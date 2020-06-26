package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdresPage extends BasePage {
    public AdresPage(WebDriver driver){
        super(driver);
    }

    public void adres(String fullname, String adres, String phone, String TC, String baslik){
        clickBy(By.className("myBasket"));
        //clickBy(By.xpath("//*[@id='boxAddress']/div[8]/div[2]/p/span"));
        clickBy(By.className("info"));
        setById("fullName",fullname);
       // clickBy(By.id("cityId"));
        setByXpath("//*[@id='cityId']", "Ankara");
        clickBy(By.id("districtId"));
        clickBy(By.xpath("//*[contains(text(), 'Akyurt')]"));
        clickBy(By.id("neighbourhoodId"));
        clickBy(By.xpath("//*[contains(text(), 'Atatürk')]"));
        setById("addressDetail", adres);
        setByText("gsm", phone);
        setById("tcNO", TC);
        setById("addressName", baslik);
        clickBy(By.xpath("//*[contains(text(), 'Adreslerime Ekle')]"));
        return;

    }
}

