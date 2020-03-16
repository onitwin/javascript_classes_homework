import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator= new Calculator();
    }
    @Test
    public void canAdd(){
        assertEquals(5,calculator.addNumbers(2,3));
    }
    @Test
    public void canSubtract(){
        assertEquals(3,calculator.subtractNumbers(7,4));
    }
    @Test
    public void canMultiply(){
        assertEquals(25,calculator.multiplyNumbers(5,5));
    }
    @Test
    public void canDivide(){
        assertEquals(3.0, calculator.divideNumbers(12,4));
    }

}
