package base;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeClass
        public static void setup () {
            Configuration.browser = "chrome";
            Configuration.timeout = 10000;
            open("https://www.google.com/");
        }


}
