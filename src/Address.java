public class Address {
    private String streetNumber;
    private String streetName;
    private String apartment;
    private String city;
    private String state;
    private String zipcode;

    public Address (String num, String name, String apartment, String city, String state, String zipcode)
    {
        streetNumber = num;
        streetName = name;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address (String num, String name, String city, String state, String zipcode)
    {
        streetNumber = num;
        streetName = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public Address (Address a)
    {
        streetNumber = a.getStreetNumber();
        streetName = a.getStreetName();
        apartment = a.getApartment();
        city = a.getCity();
        state = a.getState();
        zipcode = a.getZipcode();
    }

    public Address (String a)
    {

    }
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String toString()
    {
        String str = "";
        str += streetNumber + " " + streetName + " " + apartment + ", " + city + ", " + state + " " + zipcode;
        return str;
    }
}
