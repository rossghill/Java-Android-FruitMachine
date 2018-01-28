import java.util.ArrayList;
import java.util.Collections;


public class FruitMachineFull {


    private ArrayList<Symbol> reel1;
    private ArrayList<Symbol>  reel2;
    private ArrayList<Symbol>  reel3;
//    private ArrayList<Symbol> fruits;



    public FruitMachineFull() {
        this.reel1 = new ArrayList<>();
        this.reel2 = new ArrayList<>();
        this.reel3 = new ArrayList<>();
//        this.fruits = new ArrayList<>();
    }

    public ArrayList<Symbol>  getReel1Symbols() {
        return reel1;
    }

    public ArrayList<Symbol>  getReel2Symbols() {
        return reel2;
    }

    public ArrayList<Symbol>  getReel3Symbols() {
        return reel3;
    }

    public void shuffle(ArrayList reel) {
        Collections.shuffle(reel);
    }

    public void addSymbols(ArrayList<Symbol> reel) {
        reel.add(Symbol.CHERRY);
        reel.add(Symbol.ORANGE);
        reel.add(Symbol.BANANA);
        reel.add(Symbol.BAR);
        reel.add(Symbol.GOLD);
    }

    public void getRandomSymbols() {
        addSymbols(reel1);
        addSymbols(reel2);
        addSymbols(reel3);
        shuffle(reel1);
        Symbol reel1A = reel1.get(0);
        Symbol reel1B = reel1.get(1);
        Symbol reel1C = reel1.get(2);
        shuffle(reel2);
        Symbol reel2A = reel2.get(0);
        Symbol reel2B = reel2.get(1);
        Symbol reel2C = reel2.get(2);
        shuffle(reel3);
        Symbol reel3A = reel2.get(0);
        Symbol reel3B = reel2.get(1);
        Symbol reel3C = reel2.get(2);
        System.out.println(reel1A);

    }

//    public int spin() {
//        if (reel1 == reel2 && reel1 == reel3) {
//            int win = threeMatchingSymbols();
//            System.out.println("Congratulations! You've won £" + win);
//            return win;
//        } else {
//            int win = noMatchingSymbols();
//            System.out.println("Hard luck! Your winnings are £" + win);
//            return 0;}
//    }

//    public int threeMatchingSymbols() {
//        int value1 = reel1.getValue();
//        int value2 = reel2.getValue();
//        int value3 = reel3.getValue();
//        return value1 + value2 + value3;
//    }
//
//    public int twoMatchingSymbols() {
//        return 0;
//    }
//
//    public int noMatchingSymbols() {
//        return 0;
}