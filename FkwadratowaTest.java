package fkwadratowa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Michał
 */
public class FkwadratowaTest {
    
    public FkwadratowaTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    /**
     * Test of Delta method, of class Fkwadratowa.
     */
    @Test
    public void testDelta() {
        System.out.println("Delta");
        Fkwadratowa x = new Fkwadratowa(1.0, -2.0, 1.0);
        double expResult = 1;
        double result = x.MiejscaZerowe();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of MiejscaZerowe method, of class Fkwadratowa.
     */
    @Test
    public void testMiejscaZerowe() {
        System.out.println("MiejscaZerowe");
        double expResult = 1.0;
        Fkwadratowa x = new Fkwadratowa(1.0, -2.0, 1.0);
        double result = x.MiejscaZerowe();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMiejscaZerowe2() {
        System.out.println("MiejscaZerowe2");
        double expResult = 0;
        Fkwadratowa x = new Fkwadratowa(1.0, 0, 0);
        double result = x.MiejscaZerowe();
        assertEquals(expResult, result, 0.0);
    }
    
    
    @Test
    public void testMiejscaZerowe3() {
        System.out.println("MiejscaZerowe3");
        double expResult = 4.0;
        Fkwadratowa x = new Fkwadratowa(1.0, -4, -5);
        double result = x.MiejscaZerowe();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMiejscaZerowe4() {
        System.out.println("MiejscaZerowe3");
        double expResult = Double.NaN;
        Fkwadratowa x = new Fkwadratowa(0, -4, -5);
        double result = x.MiejscaZerowe();
        assertEquals(expResult, result, 0.0);
    }
    
    
}
