package Math;

import org.junit.Assert;
import org.junit.Test;

public class MathMultiplyTest {

    @Test
    public void testMultiplyPositiveNumbers(){
        //is
        int[]  numbers = {1, 2, 5, 10};
        //then
        final int result = Math.multiply(numbers);
        //excepted
        Assert.assertEquals(100, result);
    }
    @Test
    public void testMultiplyNegativeNumbers(){
        //is
        int[]  numbers = {-1, 2, 5, 10};
        //then
        final int result = Math.multiply(numbers);
        //excepted
        Assert.assertEquals(-100, result);
    }


}
