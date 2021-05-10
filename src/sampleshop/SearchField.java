package sampleshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchField extends BasePage{

    @Test
    public void searchField() {

        WebElement artCategory = driver.findElement(By.className("ui-autocomplete-input"));
        artCategory.click();
        artCategory.sendKeys("brown bear notebook");

        WebElement magnifier = driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[2]/div[2]/form/button/i"));
        magnifier.click();



    }


}
