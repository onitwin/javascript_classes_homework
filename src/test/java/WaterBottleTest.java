import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){
        waterBottle= new WaterBottle(100);
    }
    @Test
    public void canCheckVolume(){
        assertEquals(100,waterBottle.checkVolume());
    }
    @Test
    public void canDrinkWater(){
        assertEquals(90,waterBottle.drinkWater());
    }
    @Test
    public void canEmptyWater(){
        assertEquals(0,waterBottle.emptyBottle());
    }
    @Test
    public void canRefillWater(){
        assertEquals(100,waterBottle.refillBottle());
    }




}
