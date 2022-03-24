package enums;

public enum Portal {

    TIVIX("http://qalab.pl.tivixlabs.com/");

    String portal;

    private Portal(String url) {
        this.portal = url;
    }

    public String getPortal() {
        return portal;
    }
}
