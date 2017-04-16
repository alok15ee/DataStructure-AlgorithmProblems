package test.array;

import com.Array.Operations.DuplicateElements;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by aksingh on 16-04-2017.
 */
public class DuplicateTest extends TestCase {
    private DuplicateElements duplicateElements;

    @BeforeClass
    public void setUp(){
        duplicateElements = new DuplicateElements();
    }

    @Test
    public void testCheckDuplicatesOptimizedOne(){
        Integer arr[] = {10, 5, 3, 4, 3, 5, 6};
        boolean result = duplicateElements.checkDuplicatesOptimized(arr, 3);
        assertEquals(true, result);
    }

    @Test
    public void testCheckDuplicatesOptimizedTwo(){
        Integer arr[] = {10, 5, 3, 4, 7, 5, 6};
        boolean result = duplicateElements.checkDuplicatesOptimized(arr, 3);
        assertEquals(true,result);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
}
