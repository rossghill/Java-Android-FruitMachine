
public class Runner {


    public static void main(String[] args){

        FruitMachine fruitMachine = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.CHERRY);
        Symbol reel1 = fruitMachine.getReel1Symbol();
        Symbol reel2 = fruitMachine.getReel1Symbol();
        Symbol reel3 = fruitMachine.getReel1Symbol();
        System.out.println(reel1 + " " + reel2 + " " + reel3);
        int win = fruitMachine.threeMatchingSymbols();
        System.out.println("Congratulations! You've won £" + win);
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
        fruitMachine.shuffle();
    }

}
