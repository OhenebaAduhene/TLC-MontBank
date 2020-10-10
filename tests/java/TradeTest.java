import org.junit.Test;
import product.Future;
import product.ProductAlreadyRegisteredException;
import product.Stock;
import product.WisdomTradeProduct;

import static org.junit.Assert.assertEquals;

public class TradeTest {

    @Test
    void testTrade() throws ProductAlreadyRegisteredException {
        Stock stock1 = new Stock("TT1","ex","hello");
        Future future = new Future("FF1","ex","1",05,2020);

        WisdomTradeProduct product = new WisdomTradeProduct();

        product.addNewProduct(stock1);

        product.trade(stock1,5);
        product.trade(future,20);


    }
}
