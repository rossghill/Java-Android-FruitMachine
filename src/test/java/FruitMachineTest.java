import org.junit.Before;

public class FruitMachineTest {

    FruitMachine fruitMachine_win;
    FruitMachine fruitMachine_lose;

    @Before
    public void before() {
        fruitMachine_win = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.CHERRY);
        fruitMachine_win = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.BAR);
    }


}
