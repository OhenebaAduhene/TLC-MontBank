import org.junit.Test;
import product.ProductAlreadyRegisteredException;
import product.Stock;
import product.WisdomTradeProduct;

import java.util.Map;

public class AddNewProductTest {


    @Test(expected = ProductAlreadyRegisteredException.class)
     public void addNewProductTest() throws ProductAlreadyRegisteredException {
        WisdomTradeProduct product = new WisdomTradeProduct();
        Stock stock1 = new Stock("PID_1","exchange","ticker");
        Stock stock2 = new Stock("PID_1","exchange","ticker");


            product.addNewProduct(stock1);
            product.addNewProduct(stock2);

    }
}
