package com.Exito.steps;

import com.Exito.pages.AddProductExito;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
public class AddProductSteps {

    @Page
    AddProductExito addProductExito;

    @Step("Opens the browser")
    public void OpensBrowser(){
        addProductExito.openUrl("https://www.exito.com/");
    }

    @Step("Click on the principal menu")
    public void ClickMenu(){
        addProductExito.getDriver().findElement(addProductExito.getBtnMenu()).click();
    }
    @Step("Click on the Sports category")
    public void ClickSports(){
        addProductExito.getDriver().findElement(addProductExito.getBtnSports()).click();
    }
    @Step("Click on Mountain Bike")
    public void ClickMountainBikes(){
        addProductExito.getDriver().findElement(addProductExito.getBtnMountainBikes()).click();
    }

    @Step("Click on pop up")
    public void ClickPopUp(){
        addProductExito.getDriver().findElement(addProductExito.getBtnClosePopUp()).click();
    }
}