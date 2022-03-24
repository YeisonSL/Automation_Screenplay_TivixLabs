package enums;

public enum Llave {

    LLAVE("Reservation data");

    String llave;

    private Llave(String key) {
        this.llave = key;
    }

    public String getLlave() {
        return llave;
    }
}
