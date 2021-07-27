package az.pashabank.learning.session.task2;

public class Building {

    private String city;
    private String street;

    public Building() {}

    public Building(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
