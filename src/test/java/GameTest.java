import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    FruitMachine fruitMachine;
    Player player;

    @Before
    public void before() {
        fruitMachine = new FruitMachine(Symbol.BANANA, Symbol.GOLD, Symbol.ORANGE);
        player = new Player("Ross", 2.50);
        game = new Game(fruitMachine, player);
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
}
