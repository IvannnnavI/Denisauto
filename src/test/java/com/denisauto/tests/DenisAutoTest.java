package com.denisauto.tests;

import com.denisauto.pages.HomePage;
import com.denisauto.pages.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DenisAutoTest extends TestBase{
    HomePage homePage;
    SearchPage searchPage;

    @BeforeMethod
    public void precondition(){
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
    }


    @Test
    public void priceValidationTest() {

        homePage.clickOnShoesLink();
//        searchPage.clickOnAccept();
        searchPage.selectKids();
//        searchPage.selectTrucks();
//        searchPage.clickOnTheFirstAuto();
//
   }

//homePage.clickOnShoesLink();
//    //  searchPage.clickOnAccept();
//        searchPage.selectKids();
////        searchPage.selectSandals();
////        searchPage.clickOnFirstItem();
//    Check if the price is > 20 euro then return "High" or if the price is < 20 euro then return "Low"
}
