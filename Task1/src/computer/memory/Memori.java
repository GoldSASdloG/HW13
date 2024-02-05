package computer.memory;

public class Memori {

    private MemoriType type;
    private int volume;
    private double weight;

    public Memori(MemoriType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoriType getType() {
        return type;
    }

    public void setType(MemoriType type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Memori{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
