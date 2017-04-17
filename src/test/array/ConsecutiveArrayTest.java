package test.array;

import com.Array.Operations.CheckConsecutiveArray;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by aksingh on 16-04-2017.
 */
public class ConsecutiveArrayTest extends TestCase {
    private CheckConsecutiveArray checkConsecutiveArray;

    @BeforeClass
    public void setUp(){
        checkConsecutiveArray = new CheckConsecutiveArray();
    }

    @Test
    public void testCheckConsecutiveArrayOne(){
        Integer arr[] = {10, 5, 3, 4, 3, 5, 6};
        boolean result = checkConsecutiveArray.checkConsecutiveArray(arr);
        assertEquals(true, result);
    }

    @Test
    public void testCheckConsecutiveArrayTwo(){
        Integer arr[] = {83, 78, 80, 81, 79, 82};
        boolean result = checkConsecutiveArray.checkConsecutiveArray(arr);
        assertEquals(true,result);
    }

    @Test
    public void testCheckConsecutiveArrayThree(){
        Integer arr[] = {-5, -3, 0, 1, -2, 2,-1, -4};
        boolean result = checkConsecutiveArray.checkConsecutiveArray(arr);
        assertEquals(true,result);
    }

    @Test
    public void testCheckConsecutiveArrayFour(){
        Integer arr[] = {-5, -3, 0, 0, 1, -2, 2,-1, -4};
        boolean result = checkConsecutiveArray.checkConsecutiveArray(arr);
        assertEquals(true,result);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
}
