package test.array;

import com.Array.Operations.BuySellStockProblem;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by aksingh on 15-04-2017.
 */
public class BuySellStockTest extends TestCase {

    private BuySellStockProblem buySellStockProblem;

    @BeforeClass
    public void setUp(){
        buySellStockProblem = new BuySellStockProblem();
    }

    @Test
    public void testFindMaximumProfitOne(){
        Integer[] shareArray = {7,10,15,5,11,2,7,9,3};
        Integer result = buySellStockProblem.findMaximumProfit(shareArray);
        assertEquals(result.intValue(),8);
    }

    @Test
    public void testFindMaximumProfitTwo(){
        Integer[] shareArray = {7, 6, 4, 3, 1};
        Integer result = buySellStockProblem.findMaximumProfit(shareArray);
        assertEquals(result.intValue(),0);
    }

    @Test
    public void testAllTimeProfit(){
        Integer[] shareArray = {7, 1, 5, 3, 6, 4};
        Integer result = buySellStockProblem.allTimeProfit(shareArray);
        assertEquals(result.intValue(), 7);
    }

    @Test
    public void testAllTimeProfitTwo(){
        Integer[] shareArray = {6,4,1,3,5,7,3,1,3,4,7,9,2,5,6,0,1,2};
        Integer result = buySellStockProblem.allTimeProfit(shareArray);
        assertEquals(result.intValue(), 20);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}
