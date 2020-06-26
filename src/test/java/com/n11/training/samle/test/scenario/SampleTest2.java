package com.n11.training.samle.test.scenario;

import com.n11.training.samle.test.base.BasePage;
import com.n11.training.samle.test.base.BaseTest;
import com.n11.training.samle.test.page.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleTest2 extends BaseTest {

    @Test
    public void sampleTest() {
        //HomePage homePage = new HomePage(driver);
        //homePage.search("Samsung");
        //homePage.search("iphone");

        new HomePage(driver)
                .search("Samsung")
                .search("iphone")
                .callLoginPage()
                .login("melih@testinium.com", "123456")
                .logout();
    }

    @Test
    public void loginTest() {

        new HomePage(driver)
                .callLoginPage()
                .login("melih@testinium.com", "123456")
                .logout();
    }

    @Test
    public void registerTest() {

        new HomePage(driver)
                .callRegisterPage()
                .register("kubra", "karagoz", "test22@n11.com", "123qwe", "N11");

       // new RegisterPage(driver)
          //      .register("kubra", "karagoz", "kkk@pismail.com", "123qwe", "genderUnknown");
    }

    @Test
    public void sepetTest(){
    new HomePage(driver)
            .callLoginPage()
            .login("kubrakaragoz12@gmail.com", "123456");
    new SamplePage(driver)
            .sample();
    new AdresPage(driver)
            .adres("kubra karagoz","sgsgsdgsd sdgsdgsdgs dsgsdgsd","555555555","17558279598","sgsdgsgsd");
    new CheckoutPage(driver)
            .checkout("1234","2345","3433", "4543", "kubra karagoz", "12","20","000");

    }
}




