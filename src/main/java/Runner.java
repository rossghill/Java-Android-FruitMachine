
public class Runner {


    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.CHERRY);
        FruitMachineFull fruitMachineFull = new FruitMachineFull();
        Player player = new Player("Ross", 2.50);
        Game game = new Game(fruitMachineFull, player);
//        System.out.println("Welcome " + player.getName() + ", your balance is " + player.getWallet());
//        Symbol reel1 = fruitMachine.getReel1Symbol();
//        Symbol reel2 = fruitMachine.getReel2Symbol();
//        Symbol reel3 = fruitMachine.getReel3Symbol();
//        System.out.println(reel1 + " " + reel2 + " " + reel3);
//        int win = fruitMachine.threeMatchingSymbols();
//        System.out.println("Congratulations! You've won £" + win);
//        fruitMachine.getRandomSymbols();
//        System.out.println(fruitMachine.getReel1Symbol() + " " + fruitMachine.getReel2Symbol() + " " + fruitMachine.getReel3Symbol());
//        fruitMachine.getRandomSymbols();
//        System.out.println(fruitMachine.getReel1Symbol() + " " + fruitMachine.getReel2Symbol() + " " + fruitMachine.getReel3Symbol());
//        fruitMachine.getRandomSymbols();
//        System.out.println(fruitMachine.getReel1Symbol() + " " + fruitMachine.getReel2Symbol() + " " + fruitMachine.getReel3Symbol());
//        game.startGame();
//        player.getWallet();
//        game.startGame();
          fruitMachineFull.getRandomSymbols();

    }
}
