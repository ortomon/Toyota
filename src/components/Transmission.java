package components;

public enum Transmission {
    AUTO("акпп"),
    MANUAL("механика"),
    ROBOT("робот");

    private String type;

    Transmission(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
