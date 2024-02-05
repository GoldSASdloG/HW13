package lessonEnum045;

public class Body {
    private String typeBody;
    private String colorBody;
    private double massaBody;

    public Body(String typeBody, String colorBody, double massaBody) {
        this.typeBody = typeBody;
        this.colorBody = colorBody;
        this.massaBody = massaBody;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public String getColorBody() {
        return colorBody;
    }

    public void setColorBody(String colorBody) {
        this.colorBody = colorBody;
    }

    public double getMassaBody() {
        return massaBody;
    }

    public void setMassaBody(double massaBody) {
        this.massaBody = massaBody;
    }

    @Override
    public String toString() {
        return "Body{" +
                "typeBody='" + typeBody + '\'' +
                ", colorBody='" + colorBody + '\'' +
                ", massaBody=" + massaBody +
                '}';
    }
}
