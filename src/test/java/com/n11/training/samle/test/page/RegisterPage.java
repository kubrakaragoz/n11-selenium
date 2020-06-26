package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public HomePage register(String firstname, String lastname, String email, String password, String captcha){
        setById("firstName", firstname);
        setById("lastName", lastname);
        setById("registrationEmail",email);
        setById("registrationPassword",password);
        setById("passwordAgain",password);
        clickBy(By.xpath("//*[contains(text(), 'Kadın')]"));
        //clickBy(By.id("genderFemale"));
        //clickBy(By.id("acceptContract"));
        clickBy(By.xpath("//*[@class='checkbox']/input[@id='acceptContract']"));
        setById("captchaText", captcha );
        return new HomePage(driver);

    }

    }


