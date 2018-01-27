import java.util.ArrayList;

import static java.lang.Integer.sum;

public class FruitMachine {

    private Symbol reel1;
    private Symbol reel2;
    private Symbol reel3;
    private ArrayList<Symbol> fruits;

    public FruitMachine(Symbol reel1, Symbol reel2, Symbol reel3) {
        this.reel1 = reel1;
        this.reel2 = reel2;
        this.reel3 = reel3;
    }

    public Symbol getReel1Symbol() {
        return reel1;
    }

    public Symbol getReel2Symbol() {
        return reel2;
    }

    public Symbol getReel3Symbol() {
        return reel3;
    }

    public int threeMatchingSymbols() {
        int winnings = 0;
        int value1 = reel1.getValue();
        int value2 = reel2.getValue();
        int value3 = reel3.getValue();
        return winnings = value1 + value2 + value3;
    }
}
