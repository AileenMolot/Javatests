package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {

    public static void search(String searchText){
        $(By.name("q")).sendKeys(searchText);
        $(By.name("btnK")).submit();
    }
}
