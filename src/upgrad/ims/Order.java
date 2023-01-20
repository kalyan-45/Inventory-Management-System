package upgrad.ims;

public class Order {

    private int id;

    private Vendor vendor;
    private String date;
    private Product product;
    private int orderedQuantity;
    private float amountPaid;

    public Order(int id, Vendor vendor, String date, Product product, int orderedQuantity, float amountPaid) {
        this.id = id;
        this.vendor = vendor;
        this.date = date;
//        this.updateVendor();
    }

    public int getId() {
        return id;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {

    }



}
