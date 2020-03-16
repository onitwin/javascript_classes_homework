import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer= new Printer(100,400);
    }
    @Test
    public void canPrint(){
        assertEquals(80,printer.printPages(10,2));

    }

}
