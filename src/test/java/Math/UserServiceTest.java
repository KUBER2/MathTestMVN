package Math;

import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    private static String[] users = {"Adam","Gustaw","Kajtek"};
    final UserService testObject = new UserService(users);


    @Test
    public void testIsUserTrue(){
        //is
        String user="Adam";
        //then
        final boolean result =testObject.isUser(user);
        //excepted
        Assert.assertTrue(result);
    }

    @Test
    public void testIsUserFalse(){
        //is
        String user="Wojtek";
        //then
        final boolean result =testObject.isUser(user);
        //excepted
        Assert.assertFalse(result);
    }



}
