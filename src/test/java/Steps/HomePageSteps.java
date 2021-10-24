package Steps;

import Model.HomePageModel;

import com.thoughtworks.gauge.Step;

public class HomePageSteps {
    HomePageModel homePageModel;
    public HomePageSteps() {this.homePageModel= new HomePageModel();}

    @Step("<key> sitesine giriş yapilir")
    public void GoToWebSite(String url){
        homePageModel.GoToUrl(url);



    }

    @Step("Anasayfanin acildigi gorulur")
    public void CheckHomePageIsOpen(){
        homePageModel.checkHomePageOpened();
    }

    @Step("Giris yap butonuna tiklanir")
    public void ClickToLoginButton(){
        homePageModel.clickToLoginButton();
    }

    @Step("Kullanicinin login oldugu gorulur")
    public void CheckLoginProcess(){
        homePageModel.checkLoginProcess();
    }

    @Step("<key> urunu aratilir")
    public void SetProductNameToSearchBar(String productName){
        homePageModel.setProductNameToSearchBox(productName);
    }
}
