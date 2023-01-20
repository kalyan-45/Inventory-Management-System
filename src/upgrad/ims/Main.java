package upgrad.ims;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product(1, "-> Kalyan", "-> SuperCoder");
        System.out.println(apple.getId() + apple.getName() + apple.getCategory());

        BusinessPartner partner1 = new BusinessPartner("HighStreetBale-wadi", "Pune",
                "Maharashtra" , "Kalyan Shete", "9637442375",
                "kalyanshete01@gmail.com");

        BusinessPartner partner2 = new BusinessPartner("Mankar Chowk", "Pune", "Maharashtra",
                "Avi Kadam", "8082334411", "avi6@gmail.com");
        System.out.println(partner1.getId());
        System.out.println(partner1.getAddressDetails() + '\n' + partner1.getContactDetails());

        System.out.println(partner2.getId());
        System.out.println(partner2.getAddressDetails() + '\n' + partner2.getContactDetails());


        Vendor vendor1 = new Vendor("Mankar Chowk", "Pune", "Maharashtra",
                "Daya Zatal", "8082334411", "daya7@gmail.com", "Inspira");

        System.out.println(vendor1.getContactDetails());
    }
}