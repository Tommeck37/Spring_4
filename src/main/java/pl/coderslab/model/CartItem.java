package pl.coderslab.model;

public class CartItem {

    private Integer quantity;
    private Product product;
    private String id;


    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public CartItem(Integer quantity, Product product, String id) {
        this.quantity = quantity;
        this.product = product;
        this.id = id;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
