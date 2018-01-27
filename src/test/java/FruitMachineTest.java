import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitMachineTest {


    FruitMachine fruitMachine_win;
    FruitMachine fruitMachine_lose;

    @Before
    public void before() {
        fruitMachine_win = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.CHERRY);
        fruitMachine_lose = new FruitMachine(Symbol.CHERRY, Symbol.CHERRY, Symbol.BAR);
    }

    @Test
    public void getReelSymbol() {
        assertEquals(Symbol.CHERRY, fruitMachine_win.getReel1Symbol());
    }

    @Test
    public void getReelValue() {
        assertEquals(100, fruitMachine_lose.getReel3Symbol().getValue());
    }

    @Test
    public void returnWinningsUponWin() {
        assertEquals(30, fruitMachine_win.threeMatchingSymbols());
    }

    @Test
    public void returnZeroUponLoss() {
        assertEquals(0, fruitMachine_lose.twoMatchingSymbols());
        assertEquals(0, fruitMachine_lose.noMatchingSymbols());
    }


}
