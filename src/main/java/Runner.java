
public class Runner {


    public static void main(String[] args){

        FruitMachine fruitMachine = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.CHERRY);
//        Symbol reel1 = fruitMachine.getReel1Symbol();
//        Symbol reel2 = fruitMachine.getReel2Symbol();
//        Symbol reel3 = fruitMachine.getReel3Symbol();
//        System.out.println(reel1 + " " + reel2 + " " + reel3);
//        int win = fruitMachine.threeMatchingSymbols();
//        System.out.println("Congratulations! You've won £" + win);
        fruitMachine.getRandomSymbols();
        System.out.println(fruitMachine.getReel1Symbol() + " " + fruitMachine.getReel2Symbol() + " " + fruitMachine.getReel3Symbol());
        fruitMachine.getRandomSymbols();
        System.out.println(fruitMachine.getReel1Symbol() + " " + fruitMachine.getReel2Symbol() + " " + fruitMachine.getReel3Symbol());
        fruitMachine.getRandomSymbols();
        System.out.println(fruitMachine.getReel1Symbol() + " " + fruitMachine.getReel2Symbol() + " " + fruitMachine.getReel3Symbol());
    }

}
