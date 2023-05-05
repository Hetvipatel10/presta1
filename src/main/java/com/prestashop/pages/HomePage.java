package com.prestashop.pages;

import com.prestashop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {



    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='columns']")
    WebElement sevenproducts;

    @CacheLookup
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    WebElement searchbox;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    WebElement searchbutton;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='product_list']/li/div/div[2]/h5/a")
    WebElement blousetext;
    @CacheLookup
    @FindBy(xpath = "//ul[@id='product_list']/li[1]/div/div/div/a[1]/img")
    WebElement clickblouseimg;








    public void clickonsesrchbox(String searchbox1) {
        sendTextToElement(searchbox,searchbox1 );
    }

    public void clickOnsearchnButton() {
        clickOnElement(searchbutton);
    }





    public String verifyblouseText(String message) {
        return getTextFromElement(blousetext);
    }


    public  void clickonblouseimg(){
        clickOnElement(clickblouseimg);
    }

    public String Verifysevenproducts(){
        return getTextFromElement(sevenproducts);
    }


}

