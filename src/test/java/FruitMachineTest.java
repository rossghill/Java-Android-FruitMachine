import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitMachineTest {

//    Symbol cherry;
//    Symbol orange;
//    Symbol banana;
//    Symbol bar;
//    Symbol gold;
    FruitMachine fruitMachine_win;
    FruitMachine fruitMachine_lose;

    @Before
    public void before() {
        fruitMachine_win = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.CHERRY);
        fruitMachine_win = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.BAR);
    }

    @Test
    public void getReelSymbol() {
        assertEquals(Symbol.CHERRY, fruitMachine_win.getReel1Symbol());
    }

    @Test
    public void getReelValue() {
        assertEquals(10, fruitMachine_win.getReel1Symbol().getValue());
    }


}
