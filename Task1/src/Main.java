import calkuliator.ArifmeticKalkuliator;
import calkuliator.Operation;

public class Main {
    public static void main(String[] args) {

        ArifmeticKalkuliator kalcul = new ArifmeticKalkuliator(5,5);
        kalcul.calculate(Operation.ADD);

    }
}