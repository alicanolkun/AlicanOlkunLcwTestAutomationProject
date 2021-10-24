package Steps;

import Model.HomePageModel;
import Model.LoginModel;
import com.thoughtworks.gauge.Step;

public class LoginPageSteps {
    LoginModel loginModel;
    public LoginPageSteps() {this.loginModel= new LoginModel();}

    @Step("<key> email adresi yazilir")
    public void SetEmailAddress(String emailAddress){
        loginModel.setEmailAddress(emailAddress);
    }

    @Step("<key> şifre yazilir")
    public void SetPassword(String password){
        loginModel.setPassword(password);
    }

    @Step("Login sayfasinda Giris Yap butonuna tiklanir")
    public void ClickToLoginButton(){
        loginModel.clickToLoginButton();
    }
}
