import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest{

    @Test
    public void testLoginWithInvalidData(){

        Page page = new Page(driver);
        page.getURL().clickEnterBtn().fillEmail("test@test.com").fillPassword("12345").clickLoginBtn();
        Assert.assertEquals(page.getErrorMessage(), "Неверно указан E-mail или пароль");
    }
}
