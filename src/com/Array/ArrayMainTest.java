package com.Array;

import com.Array.Operations.ArrayAddition;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by aksingh on 10-04-2017.
 */
public class ArrayMainTest extends TestCase {

    private ArrayAddition arrayAddition;

    @BeforeClass
    public void setUp(){
        arrayAddition = new ArrayAddition();
    }

    @Test
    public void testAddTwoArray(){
        Integer arr1[] = {7,8};
        Integer arr2[] = {2,5,9,4,9};
        arrayAddition.addTwoArray(arr1, arr2);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}