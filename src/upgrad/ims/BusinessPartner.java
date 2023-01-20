package upgrad.ims;

public class BusinessPartner {
    private static int idCounter;
    private int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

    }

    private Address address;

    private static class Contact {
        String contactName, contactPhone, contactEmail;
        private Contact(String contactName, String contactPhone, String contactEmail) {
            this.contactName = contactName;
            this.contactPhone =contactPhone;
            this.contactEmail = contactEmail;
        }

    }
    private Contact contact;

    static {
        idCounter = 0;
    }

    public BusinessPartner(String addressStreet, String addressCity, String addressState, String contactName,
                           String contactPhone, String contactEmail) {
        this.id = ++idCounter;

        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return address.street + " " + address.city + " " + address.state;
    }

    public String getContactDetails() {
        return contact.contactName + " " + contact.contactPhone + " " + contact.contactEmail;
    }

}
