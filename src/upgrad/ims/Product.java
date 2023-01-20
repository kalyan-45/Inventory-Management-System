package upgrad.ims;

public class Product {

    private static int idCounter;
    private int id;
    private String name;
    private String category;
    private float salesPrice;
    private float cost;
    int quantity;
    private boolean active;

    static {
        idCounter = 0;
    }

    public Product() {
        this("product", "category", 0f, 0f, 0, false);
    }

    public Product (String name, String category,
                    float salesPrice, float cost, int quantity,
                    boolean active) {
        this.id = ++idCounter;
        this.name = name;
        this.category = category;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
        this.active = active;
    }

    public Product (Product product) {
        this.id = product.id;
        this.name = product.name;
        this.category = product.category;
        this.salesPrice = product.salesPrice;
        this.cost = product.cost;
        this.quantity = product.quantity;
        this.active = product.active;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = Math.max(salesPrice, 0.0f);
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    float getProfitOrLoss() {
        return salesPrice - cost;
    }

    public boolean isActive() {
        return active;
    }


    void activate() {
        active = true;
    }

    void deactivate() {
        active = false;
    }

    public boolean isBelowThreshold() {
        return this.quantity < 100;
    }

    public static int countProducts() {
        return idCounter;
    }

}
