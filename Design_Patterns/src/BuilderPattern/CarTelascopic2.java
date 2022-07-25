package BuilderPattern;

public class CarTelascopic2 {
    String insuarance;
    Boolean etc;
    String roadAssistance;
    String dropOffLocation;

    public CarTelascopic2(String insuarance, Boolean etc, String roadAssistance, String dropOffLocation) {
        this.insuarance = insuarance;
        this.etc = etc;
        this.roadAssistance = roadAssistance;
        this.dropOffLocation = dropOffLocation;
    }



    @Override
    public String toString() {
        return "CarTelascopic2{" +
                "insuarance='" + insuarance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                '}';
    }
}
