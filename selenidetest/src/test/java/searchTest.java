import base.TestBase;
import org.junit.Test;
import pages.GoogleSearchPage;
import pages.GoogleSearchResultPage;

public class searchTest extends TestBase {
    @Test
    public void searchTest(){

        String searchText = "The Beatles";
        GoogleSearchPage.search(searchText);
        GoogleSearchResultPage.verifySearchResults(searchText);
    }
}
