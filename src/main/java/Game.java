public class Game {

    FruitMachine fruitMachine;
    Player player;

    public Game(FruitMachine fruitMachine, Player player) {
        this.fruitMachine = fruitMachine;
        this.player = player;
    }

    public void startGame() {
        System.out.println("Welcome " + player.getName() + ", your balance is " + player.getWallet());
        player.spendMoney(0.5);
        fruitMachine.getRandomSymbols();
        fruitMachine.spin();
    }
}
