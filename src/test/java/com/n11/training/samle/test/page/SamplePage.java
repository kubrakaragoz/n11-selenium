package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamplePage extends BasePage{


    public SamplePage(WebDriver driver) {
        super(driver);
    }

    public void sample(){
        clickBy(By.xpath("//*[@class='catMenu']/ul/li[2]/a"));
        clickBy(By.xpath("//*[@class='columnContent']/a[1]/img[1]"));
        clickBy(By.xpath("//*[contains(text(), 'Sepete Ekle')]"));
        return;

    }

    }


