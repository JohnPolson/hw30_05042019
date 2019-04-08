package RaysMusicEx;

public enum InstrumentName {

    BassGuitar("Bass Guitar"),
    ElectricGuitar("Electric Guitar"),
    AcousticGuitar("Acoustic Guitar"),
    ClassicalPiano("Classical Piano"),
    ElectricKeyboard("Electric Keyboard"),
    Violin("Violin"),
    Cello("Cello"),
    Harp("Harp"),
    Saxaphone("Saxaphone"),
    BassDrum("Bass Drum"),
    KettleDrum("Kettle Drum"),
    SnareDrum("Snare Drum");


    protected final String name;

    InstrumentName(String name) {
        this.name = name;
    }

    public String getInstrumentName() {
        return name;
    }

}
