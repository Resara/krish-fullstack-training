package BuilderPattern;

public class CarTelascopic1 {
    String insuarance;
    Boolean etc;
    String roadAssistance;
    String dropOffLocation;

    public CarTelascopic1(String insuarance){
        this.insuarance = insuarance;
    }
    public CarTelascopic1(String insuarance, Boolean etc){
        this(insuarance);
        this.etc = etc;
    }
    public CarTelascopic1(String insuarance, Boolean etc, String roadAssistance){
        this(insuarance, etc);
        this.roadAssistance = roadAssistance;
    }
    public CarTelascopic1(String insuarance, Boolean ect, String roadAssistance, String dropOffLocation){
        this(insuarance,ect,roadAssistance);
        this.dropOffLocation = dropOffLocation;
    }

    @Override
    public String toString() {
        return "CarTelascopic1{" +
                "insuarance='" + insuarance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                '}';
    }
}
