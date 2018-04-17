package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchResultPage {

    public static void verifySearchResults(String searchText){
        $(By.cssSelector("h3.r a")).shouldHave(Condition.text(searchText));
    }
}
