import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class searchTest {
    @Test
    public void searchTest(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        String searchText = "The Beatles";

        open("https://www.google.com/");

        $(By.name("q")).sendKeys(searchText);
        $(By.name("btnK")).submit();
        $(By.cssSelector("h3.r a")).shouldHave(Condition.text(searchText));
    }
}
