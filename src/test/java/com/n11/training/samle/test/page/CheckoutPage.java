package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.sun.tools.corba.se.idl.StringGen;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver){
        super(driver);
    }

    public void checkout(String KartNo1, String KartNo2, String KartNo3, String KartNo4, String FullName,String sktDay, String sktYear, String Cvv){
        clickBy(By.id("js-goToPaymentBtn"));
       // clickBy(By.xpath("//*[contains(text(), 'Ödemeye Geç')]"));
        setByXpath("//*[@tabindex='1']", KartNo1);
        setByXpath("//*[@tabindex='2']", KartNo2);
        setByXpath("//*[@tabindex='3']", KartNo3);
        setByXpath("//*[@tabindex='4']", KartNo4);
        setById("cardOwnerName", FullName);
        setById("expireMonth", sktDay);
        setById("expireYear", sktYear);
        setById("securityCode", Cvv);

    }

}

