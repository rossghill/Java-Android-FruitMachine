import java.util.ArrayList;
import java.util.Collections;

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
        this.fruits = new ArrayList<>();
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
        int value1 = reel1.getValue();
        int value2 = reel2.getValue();
        int value3 = reel3.getValue();
        return value1 + value2 + value3;
    }

    public int twoMatchingSymbols() {
        return 0;
    }

    public int noMatchingSymbols() {
        return 0;
    }

    public void shuffle() {
        fruits.add(Symbol.CHERRY);
        fruits.add(Symbol.ORANGE);
        fruits.add(Symbol.BANANA);
        fruits.add(Symbol.BAR);
        fruits.add(Symbol.GOLD);
        Collections.shuffle(fruits);
        Symbol returned_symbol = fruits.get(0);
        System.out.println(returned_symbol);
    }
}
