package test.recursion;

/**
 * Created by root on 2/5/16.
 */


import  static org.junit.Assert.*;

import com.recursion.GCD;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test.*;

public class TestGCD extends TestCase {

    GCD testGCD;

    @BeforeClass
    public void setUp(){
        testGCD = new GCD();
    }

    @Test
    public void testFindGCD(){
        testGCD.findGCD(6,12);
    }

}
