package sampleshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArtTest extends BasePage{

        @Test(priority = 1)
        public void openArtCategory() {

            WebElement artCategory = driver.findElement(By.id("category-9"));
            artCategory.click();

            //Actions action = new Actions(driver);
            //action.pause(500);
        }
        @Test(priority = 2)
        public void checkTitle(){

            String pageTitle = driver.getTitle();

            Assert.assertEquals(pageTitle, "Art");
        }

       @Test(priority = 3)
       public void checkPageUrl(){
           String pageUrl = driver.getCurrentUrl();

            Assert.assertEquals(pageUrl,"http://sampleshop.inqa.pl/9-art");
        }
    }

