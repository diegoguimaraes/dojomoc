/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kata;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Herberth
 */
public class MathTest {

    private Math math;
    public MathTest() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        math = new Math();
    }

    @After
    public void tearDown() {
        math=null;
    }

    /**
     * Test of sum method, of class Math.
     */
    @Test
    public void testSum() {
        assertEquals(2, math.sum(1, 1));
        assertEquals(4, math.sum(1, 3));
        assertEquals(5, math.sum(3, 2));
    }

    /**
     * Test of sub method, of class Math.
     */
    @Test
    public void testSub() {
        assertEquals(1, math.sub(3, 2));
        assertEquals(0, math.sub(3, 3));
        assertEquals(-4, math.sub(3, 7));
    }

    /**
     * Test of mul method, of class Math.
     */
    @Test
    public void testMul() {
        assertEquals(-4, math.mul(4, -1));
        assertEquals(8, math.mul(4,2));
        assertEquals(3, math.mul(1,3));
    }

    /**
     * Test of div method, of class Math.
     */
    @Test
    public void testDiv() {
        //assertEquals(2,math.div(2, 1));
        //assertEquals(2.5,math.div(5, 2));
    }

}