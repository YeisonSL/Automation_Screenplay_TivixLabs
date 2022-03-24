package enums;

public enum WrongMessage {

    WRONG_MESSAGE("Page not found");

    String mensaje;

    private WrongMessage(String mesaje) {
        this.mensaje = mesaje;
    }

    public String getMensajeConfirmacion() {
        return mensaje;
    }
}
