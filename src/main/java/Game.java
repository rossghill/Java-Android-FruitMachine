import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Game {

    FruitMachine fruitMachine;
    Player player;

    public Game(FruitMachine fruitMachine, Player player) {
        this.fruitMachine = fruitMachine;
        this.player = player;
    }

    public void startGame() {
        System.out.println("Welcome " + player.getName() + ", your balance is " + player.getWallet());
        while (player.getWallet() > 0) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Type SPIN to play or QUIT to end game");
            String selection = reader.next();
            selection = selection.toUpperCase();
            if (selection.equals("SPIN") ) {
                player.spendMoney(0.5);
                fruitMachine.getRandomSymbols();
                fruitMachine.spin();
            } else if (selection.equals("QUIT")) {
                System.out.println("Thanks for playing! Your balance is " + player.getWallet());
                break;
            } else {
                System.out.println("I don't recognise that command.");
            }
            reader.close();
        }

    }

}
