package RaysMusicEx;

public enum InstrumentType {

    BRASS("Brass"),
    STRINGED("Stringed"),
    WOODWIND("WoodWind"),
    KEYBOARD("Keyboard"),
    PERCUSION("Percussion");

    protected final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getInstrumentType () {
        return type;
    }

}
