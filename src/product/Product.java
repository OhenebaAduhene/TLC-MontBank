package product;

import java.util.Objects;

abstract class Product {
    String productId;
    abstract double getValue();

    public Product(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {

        Product product = (Product) o;
        return this.productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

}
