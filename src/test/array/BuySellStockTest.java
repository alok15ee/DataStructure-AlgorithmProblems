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
        assertEquals(result.intValue(),8);
    }
}
