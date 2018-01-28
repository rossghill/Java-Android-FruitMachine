import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    FruitMachine fruitMachine;
    FruitMachineFull fruitMachineFull;
    Player player;

    @Before
    public void before() {
        fruitMachine = new FruitMachine(Symbol.BANANA, Symbol.GOLD, Symbol.ORANGE);
        fruitMachineFull = new FruitMachineFull();
        player = new Player("Ross", 2.50);
        game = new Game(fruitMachineFull, player);
    }

//    @Test
//    public void gameHasFruitMachine() {
//        assertEquals(Symbol.BANANA, fruitMachine());
//    }

    @Test
    public void playerHasName() {
        assertEquals("Ross", player.getName());
    }

    @Test
    public void playerHasMoney() {
        assertEquals(2.50, player.getWallet(), 0.01);
    }

    @Test
    public void moneyCanBeRemovedFromWallet() {
        assertEquals(2.00, player.spendMoney(0.50), 0.01);
    }
}
