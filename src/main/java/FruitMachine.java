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

    public void getRandomSymbols() {
        fruits.add(Symbol.CHERRY);
        fruits.add(Symbol.ORANGE);
        fruits.add(Symbol.BANANA);
        fruits.add(Symbol.BAR);
        fruits.add(Symbol.GOLD);
        Collections.shuffle(fruits);
        Symbol random_symbol = fruits.get(0);
        reel1 = random_symbol;
        Collections.shuffle(fruits);
        Symbol random_symbol2 = fruits.get(0);
        reel2 = random_symbol2;
        Collections.shuffle(fruits);
        Symbol random_symbol3 = fruits.get(0);
        reel3 = random_symbol3;
    }
}
