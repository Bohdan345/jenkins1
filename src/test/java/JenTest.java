import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class JenTest {


    @Test
    public void openSomething() {
        open("https://preprod.snov.io/prospects#/list/21445");
        Selenide.sleep(1000);
    }
}
