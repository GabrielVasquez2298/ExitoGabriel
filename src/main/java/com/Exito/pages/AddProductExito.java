package com.Exito.pages;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
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

}
