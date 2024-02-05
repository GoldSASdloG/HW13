package lessonEnum045;

public class Wheels {
    private int count;
    private int diametr;

    public Wheels(int count, int diametr) {
        this.count = count;
        this.diametr = diametr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "count=" + count +
                ", diametr=" + diametr +
                '}';
    }
}
