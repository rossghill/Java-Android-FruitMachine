import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Game {

    FruitMachineFull fruitMachineFull;
    Player player;

    public Game(FruitMachineFull fruitMachineFull, Player player) {
        this.fruitMachineFull = fruitMachineFull;
        this.player = player;
    }

    public void startGame() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome " + player.getName() + ", your balance is £" + player.getWallet());
        while (player.getWallet() > 0) {
            System.out.println("Type SPIN to play or QUIT to end game");
            System.out.println("Your current balance is: " + player.getWallet());
            String selection = "";
            selection = reader.next();
            selection = selection.toUpperCase();
            if (selection.equals("SPIN") ) {
                player.spendMoney(0.5);
                int result = fruitMachineFull.spin();
                if (result > 0) {
                    System.out.println("Congrats! You won £");
                    player.wallet += result;
                }
                else {
                    System.out.println("Sorry, you lost");
                }

            } else if (selection.equals("QUIT")) {
                System.out.println("Thanks for playing! Your balance is £" + player.getWallet());
                break;
            } else {
                System.out.println("I don't recognise that command.");
            }
        }

    }

}
