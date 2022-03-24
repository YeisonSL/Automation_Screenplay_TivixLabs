package models;

public class ReservationInformation {

    private String country;
    private String city;
    private String model;
    private String pickUpDate;
    private String dropUpDate;
    private String name;
    private String lastName;
    private String cardNumber;
    private String email;

    public ReservationInformation(String country, String city, String model, String pickUpDate, String dropUpDate, String name, String lastName, String cardNumber, String email) {
        this.country = country;
        this.city = city;
        this.model = model;
        this.pickUpDate = pickUpDate;
        this.dropUpDate = dropUpDate;
        this.name = name;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getModel() {
        return model;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public String getDropUpDate() {
        return dropUpDate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEmail() {
        return email;
    }
}
