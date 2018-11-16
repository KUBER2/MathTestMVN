package Math;

import org.junit.Assert;
import org.junit.Test;

public class MathPowerTest {

    @Test
    public void testPowerInPositiveNumber(){
        //is
        int  number = 5;
        //then
        final int result = Math.power(number);
        //excepted
        Assert.assertEquals(120, result);
    }
    @Test
    public void testPowerInNegativeNumber(){
        //is
        int  number = -5;
        //then
        final int result = Math.power(number);
        //excepted
        Assert.assertEquals(-1, result);
    }

}
