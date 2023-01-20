package upgrad.ims;

public class Order {

    private int id;

    private Vendor vendor;
    private String date;
    private Product orderedProduct;
    private int orderedQuantity;
    private float amountPaid;

    public Order(int id, Vendor vendor, String date, Product orderedProduct, int orderedQuantity, float amountPaid) {
        this.id = id;
        this.vendor = vendor;
        this.date = date;
        this.orderedProduct = orderedProduct;
        this.orderedQuantity = orderedQuantity;
        this.amountPaid = amountPaid;

    }

    public int getId() {
        return id;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor.setCredit(this.vendor.checkDue() - (orderedProduct.getCost() * orderedQuantity - amountPaid));
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.vendor.setCredit(this.vendor.checkDue() - (orderedProduct.getCost() * orderedQuantity - amountPaid));
        this.orderedProduct = orderedProduct;
        this.updateVendorCredit();
    }

    public int getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(int orderedQuantity) {
        this.vendor.setCredit(this.vendor.checkDue() - (orderedProduct.getCost() * orderedQuantity - amountPaid));
        this.orderedQuantity = orderedQuantity;
        this.updateVendorCredit();
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.vendor.setCredit(this.vendor.checkDue() - (orderedProduct.getCost() * orderedQuantity - amountPaid));
        this.amountPaid = amountPaid;
        this.updateVendorCredit();
    }
     void updateVendorCredit() {
        System.out.println(this.vendor.checkDue());
        System.out.println(orderedProduct.getCost());
        System.out.println(orderedQuantity);
        System.out.println(amountPaid);
        this.vendor.setCredit(this.vendor.checkDue() - (orderedProduct.getCost() * orderedQuantity - amountPaid));
    }

}
