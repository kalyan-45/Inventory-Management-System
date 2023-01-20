package upgrad.ims;
import java.sql.Connection;
public class Product {
    private int id;

    static {
        int idCounter;
    }
    private String name;
    private String category;
    private float salesPrice;
    private float cost;
    int quantity;
    private boolean active;

    float getProfitOrLoss() {
        return salesPrice - cost;
    }

    void activate() {
        active = true;
    }



    Product(int id, String name, String category) {
        this.id = ++id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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


}
