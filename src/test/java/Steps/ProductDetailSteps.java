package Steps;

import Model.ProductDetailModel;
import Model.ProductModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductDetailSteps {
    ProductDetailModel productDetailModel;
    public ProductDetailSteps() {this.productDetailModel=new ProductDetailModel();}

    @Step("Urun bedeni secilir")
    public void SelectProductSize() throws InterruptedException {
        productDetailModel.selectProductSize();
    }

    @Step("Urun sepete eklenir")
    public void AddToCartProduct() throws InterruptedException {
        productDetailModel.clickToAddToCartButton();
    }

    @Step("Sepetim butonuna tiklanir")
    public void ClickToMyCartButton() {
        productDetailModel.clickToMyCartButton();
    }

    @Step("Urun fiyatinin sepet fiyati ile aynı oldugu gorulur")
    public void checkProductPrices(){
        Assert.assertEquals("fiyatlar farkli",productDetailModel.getProductPriceFromCart(),productDetailModel.getProductPrice());
    }
}
