import org.example.*;
import org.junit.Test;

public class TestCase extends BaseTest {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    BasketPage cartPage = new BasketPage();
    FavoriPage favPage = new FavoriPage();


    @Test
    public void testCase1() throws InterruptedException {


        homepage.goToHomepage(driver);
        Log4j.info("Go to login page");
        homepage.goToLoginPage(driver);
        loginPage.login(driver,"duygusys@icloud.com","Df080119");
        homepage.search(driver,"Kazak");
        searchPage.scrollDown(driver);
        searchPage.collectProducts();
        searchPage.setFavProducts();
        searchPage.addFav(driver);
        Log4j.info("Go to HomePage");
        homepage.goToHomepage(driver);
        homepage.search(driver, "Çanta");
        Log4j.info("Çanta ile ilgili sonuçlar çıktı");
        searchPage.addProduct(driver);
        Log4j.info("Go to basketPage");
        searchPage.goToCart(driver);
        cartPage.quantityUp(driver);
        cartPage.confirmShopping(driver);
        cartPage.saveAddress(driver);
        cartPage.editCart(driver);
        homepage.goToHomepage(driver);
        homepage.goToFav(driver);
        favPage.addFavList();
        favPage.addToProduct(driver);

    }
}
