package com.snc.it.sam_premium.ui.tests;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitTestOrder {
    private static StringBuilder output = new StringBuilder("");
 
    @Test
    public void bsecondTest() {
        output.append("b");
    }
 
    @Test
    public void cthirdTest() {
        output.append("c");
    }
 
    @Test
    public void afirstTest() {
        output.append("a");
    }
 
    @AfterClass
    public static void assertOutput() {
        assertEquals(output.toString(), "abc");
    }
}
