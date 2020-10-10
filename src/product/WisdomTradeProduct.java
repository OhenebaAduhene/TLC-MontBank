package product;

import java.util.HashMap;
import java.util.Map;

public class WisdomTradeProduct implements MontrealTradeProducts{
    private Map<Product,Integer> registeredProduct = new HashMap<>();
    private Map<Product,Integer> tradedProduct = new HashMap<>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(registeredProduct.containsKey(product)) {
            throw new ProductAlreadyRegisteredException(

            );
        }
        else {
            registeredProduct.put(product, 0);

        }

    }

    @Override
    public void trade(Product product, int quantity) {
        if(registeredProduct.containsKey(product)){
            int oldQuantity =  registeredProduct.get(product);
            int newQuantity = oldQuantity + quantity;
            tradedProduct.put(product, newQuantity);
        }

    }

    @Override
    public int totalTradeQuantityForDay() {
        int quantity = 0;

        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
