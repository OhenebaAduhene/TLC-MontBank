package product;

public class Stock extends Product{
    private String exchange;
    private String ticker;


    public Stock(String productId,String exchange, String ticker) {
        super(productId);
        this.exchange = exchange;
        this.ticker = ticker;
    }

    private ProductPricingService productPricingService;

    public void setProductPricingService(ProductPricingService productPricingService){
        this.productPricingService = productPricingService;
    }


    @Override
    double getValue() {
        return productPricingService.price(exchange, ticker);
    }

}
