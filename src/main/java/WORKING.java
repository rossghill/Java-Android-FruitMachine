//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//
//public class FruitMachineFull {
//
//    private Symbol reel1A;
//    private Symbol reel1B;
//    private Symbol reel1C;
//    private Symbol reel2A;
//    private Symbol reel2B;
//    private Symbol reel2C;
//    private Symbol reel3A;
//    private Symbol reel3B;
//    private Symbol reel3C;
//    private ArrayList<Symbol> allReels;
//    private ArrayList<Symbol> fruits;
//
//
//    public FruitMachineFull() {
//        this.reel1A = reel1A;
//        this.reel1B = reel1B;
//        this.reel1C = reel1C;
//        this.reel2A = reel2A;
//        this.reel2B = reel2B;
//        this.reel2C = reel2C;
//        this.reel3A = reel3A;
//        this.reel3B = reel3B;
//        this.reel3C = reel3C;
//        this.allReels = new ArrayList<>();
//        allReels.addAll(Arrays.asList(reel1A, reel1B, reel1C, reel2A, reel2B, reel2C, reel3A, reel3B, reel3C));
//        this.fruits = new ArrayList<Symbol>();
//    }
//
//    public void addSymbols() {
//        fruits.add(Symbol.CHERRY);
//        fruits.add(Symbol.ORANGE);
//        fruits.add(Symbol.BANANA);
//        fruits.add(Symbol.BAR);
//        fruits.add(Symbol.GOLD);
//    }
//
//    public void shuffle() {
//        Collections.shuffle(fruits);
//    }
//
//    public void getRandomSymbols() {
//        addSymbols();
//        for (Symbol reel : allReels) {
//            shuffle();
//            reel = fruits.get(0);
//            allReels.add(reel);
//        }
//        addSymbols(reel1);
//        addSymbols(reel2);
//        addSymbols(reel3);
//        shuffle(reel1);
//        Symbol reel1A = reel1.get(0);
//        Symbol reel1B = reel1.get(1);
//        Symbol reel1C = reel1.get(2);
//        shuffle(reel2);
//        Symbol reel2A = reel2.get(0);
//        Symbol reel2B = reel2.get(1);
//        Symbol reel2C = reel2.get(2);
//        shuffle(reel3);
//        Symbol reel3A = reel2.get(0);
//        Symbol reel3B = reel2.get(1);
//        Symbol reel3C = reel2.get(2);
//        System.out.println(reel1A + " | " + reel2A + " | " + reel3A);
//        System.out.println(reel1B + " | " + reel2B + " | " + reel3B);
//        System.out.println(reel1C + " | " + reel2C + " | " + reel3C);

//    }
//}
//    public int spin() {
//        getRandomSymbols();
//        if (reel1A == reel2B && reel2B == reel3C) {
//            int win = threeMatchingSymbols();
//            System.out.println("Congratulations! You've won £" + win);
//            return win;
//        } else {
//            int win = noMatchingSymbols();
//            System.out.println("Hard luck! Your winnings are £" + win);
//            return 0;}
//    }
//
//    public int threeMatchingCentre() {
//        int value1 = reel1.getValue();
//        int value2 = reel2.getValue();
//        int value3 = reel3.getValue();
//        return value1 + value2 + value3;
//    }
//
//    public int threeMatchingDiagonalHighLow() {
//        return 0;
//    }
//
//    public int noMatchingSymbols() {
//        return 0;
//}