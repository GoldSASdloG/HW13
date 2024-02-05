package computer.processor;

public class Processor {
    private Chastota chastota;
    private CoreCount coreCount;
    private Creator creator;
    private double weight;

    public Processor(Chastota chastota, CoreCount coreCount, Creator creator, double weight) {
        this.chastota = chastota;
        this.coreCount = coreCount;
        this.creator = creator;
        this.weight = weight;
    }

    public Chastota getChastota() {
        return chastota;
    }

    public void setChastota(Chastota chastota) {
        this.chastota = chastota;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "chastota=" + chastota +
                ", coreCount=" + coreCount +
                ", creator=" + creator +
                ", weight=" + weight +
                '}';
    }
}
