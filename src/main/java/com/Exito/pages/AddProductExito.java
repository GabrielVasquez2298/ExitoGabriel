package com.Exito.pages;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import java.lang.String;
public class AddProductExito extends PageObject {


    private By btnMenu = By.xpath("//*[@id=\"Trazado_7822\"]");

    public By getBtnMenu() {
        return btnMenu;
    }



    private By btnSports = By.xpath("/html/body/div[13]/div[3]/div/div/div[5]/ul/li[11]");

    public By getBtnSports() {
        return btnSports;
    }

    public By getBtnClosePopUp() {
        return btnClosePopUp;
    }

    private By btnClosePopUp = By.xpath("//*[@id=\"wps-overlay-close-button\"]");



    private By btnMountainBikes = By.xpath("//a[@id='Categorías-nivel3-Bicicletas de montaña']");

    public By getBtnMountainBikes() {
        return btnMountainBikes;
    }




    private By InfoProduct = By.xpath("//*[@id=\"gallery-layout-container\"]/div[2]/section/a/article/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div[1]/h3/span");

    public By getInfoProduct() {
        return InfoProduct;
    }




    private By btnAddCart = By.xpath("//*[@id=\"gallery-layout-container\"]/div[2]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button");
    public By getBtnAddCart() {
        return btnAddCart;
    }



    private By btnMyCart = By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div/a");
    public By getBtnMyCart() {
        return btnMyCart;
    }



    private By txtCorreo = By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/form/div[4]/input");
    public By getTxtCorreo() {
        return txtCorreo;
    }



    private By btnConfirm = By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[5]/div/div/form/button");
    public By getBtnConfirm() {
        return btnConfirm;
    }


    private By sameProduct = By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[4]/span");
    public By getAddedProduct() {
        return sameProduct;
    }

}
