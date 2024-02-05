package lessonEnum045;

public class Engine {
    private String marka;
    private double volume;
    private String moshnost;
    private int kolvoCilinder;

    public Engine(String marka, double volume, String moshnost, int kolvoCilinder) {
        this.marka = marka;
        this.volume = volume;
        this.moshnost = moshnost;
        this.kolvoCilinder = kolvoCilinder;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMoshnost() {
        return moshnost;
    }

    public void setMoshnost(String moshnost) {
        this.moshnost = moshnost;
    }

    public int getKolvoCilinder() {
        return kolvoCilinder;
    }

    public void setKolvoCilinder(int kolvoCilinder) {
        this.kolvoCilinder = kolvoCilinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "marka='" + marka + '\'' +
                ", volume=" + volume +
                ", moshnost='" + moshnost + '\'' +
                ", kolvoCilinder=" + kolvoCilinder +
                '}';
    }
}
