package product;

public class ProductAlreadyRegisteredException extends Exception {
    private String message = null;

    public ProductAlreadyRegisteredException(){
        super();
    }

    public ProductAlreadyRegisteredException(String message){
        super(message);
        this.message = message;
    }

    public ProductAlreadyRegisteredException(Throwable cause){
        super(cause);
    }

    @Override
    public String toString(){
        return message;
    }

    @Override
    public  String getMessage(){
        return message;
    }
}
