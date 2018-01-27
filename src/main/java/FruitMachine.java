import java.util.ArrayList;

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
}
