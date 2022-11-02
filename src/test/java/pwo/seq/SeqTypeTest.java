/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.seq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author gman
 */
public class SeqTypeTest {

    /**
     * Test of values method, of class SeqType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult
                = {SeqType.FIB, SeqType.LUC, SeqType.TRI};
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class SeqType.
     */
    /**
     * Test of fromString method, of class SeqType.
     */
    @Test
    public void testFromString() {
        System.out.println("fromStringFibonacci");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    @Test
    public void testFromStringLucas() {
        System.out.println("fromStringLucas");
        String type = "lucas";
        SeqType expResult = SeqType.LUC;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    @Test
    public void testFromStringTribonacci() {
        System.out.println("fromStringTribonacci");
        String type = "tribonacci";
        SeqType expResult = SeqType.TRI;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getGenerator method, of class SeqType.
     */
    @Test
    public void testGetGenerator() {
        System.out.println("getGeneratorFibonacci");
        SeqType instance = SeqType.FIB;
        Generator result = instance.getGenerator();
        assertEquals(FibonacciGenerator.class, result.getClass());
    }

    @Test
    public void testGetGeneratorLucas() {
        System.out.println("getGeneratorLucas");
        SeqType instance = SeqType.LUC;
        Generator result = instance.getGenerator();
        assertEquals(LucasGenerator.class, result.getClass());
    }

    @Test
    public void testGetGeneratorTribonacci() {
        System.out.println("getGeneratorTribonacci");
        SeqType instance = SeqType.TRI;
        Generator result = instance.getGenerator();
        assertEquals(TribonacciGenerator.class, result.getClass());
    }

}
