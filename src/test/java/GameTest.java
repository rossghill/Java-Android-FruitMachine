import org.junit.Before;

public class GameTest {

    Game game;
    FruitMachine fruitMachine;

    @Before
    public void before() {
        fruitMachine = new FruitMachine(Symbol.BANANA, Symbol.GOLD, Symbol.ORANGE);
        game = new Game(fruitMachine);
    }
}
