package Steps;

import Model.ProductModel;
import com.thoughtworks.gauge.Step;

public class ProductPageSteps {
    ProductModel productModel;
    public ProductPageSteps() {this.productModel=new ProductModel();}

    @Step("Sayfanin sonuna scroll edilir")
    public void ScrollToEndOfThePage() throws InterruptedException {
        productModel.scrollUntillElement();
    }

    @Step("Daha fazla urun gor butonuna tiklanir")
    public void ClickToSeeMoreProduct(){
        productModel.clickToSeeMoreProductButton();
    }

    @Step("Rastgele bir urun secilir")
    public void selectRandomProduct() throws InterruptedException {
        productModel.selectRandomProduct();
    }
}
