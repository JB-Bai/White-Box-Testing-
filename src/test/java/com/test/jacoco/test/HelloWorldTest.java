package com.test.jacoco.test;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

        import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
        assertEquals(0, a);
        a = hw.Method3(6,-1,-1);
        assertEquals(0, a);
        a = hw.Method3(6,1,1);
        assertEquals(0, a);
        a = hw.Method3(4,1,-3);
        assertEquals(0, a);
        a = hw.Method3(4,1,-1);
        assertEquals(0, a);
        a = hw.Method3(5,1,-1);
        assertEquals(0, a);

    	
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4()
    {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, -1, 1,0,0);
        assertEquals(0, a);
        a = hw.Method4(2, 2, 1,0,0);
        assertEquals(0, a);
        a = hw.Method4(5, 1, 1,1,5);
        assertEquals(0, a);
        //a = hw.Method4(5, 1, 1,2,5);
        //assertEquals(0, a);
    }

    @Test
    public void bug()
    {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(0);
        assertFalse(a);
        a = hw.bug(5);
        assertTrue(a);
    }

    @Test
    public void isTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(1,1,1);
        assertTrue(a);
        a = hw.isTriangle(2,1,1);
        assertFalse(a);
        a = hw.isTriangle(1,2,1);
        assertFalse(a);
        a = hw.isTriangle(1,1,3);
        assertFalse(a);

    }

    @Test
    public void isBirthday(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isBirthday(1800,1,1);
        assertFalse(a);
        a = hw.isBirthday(2800,1,1);
        assertFalse(a);
        a = hw.isBirthday(2000,12,1);
        assertTrue(a);
        a = hw.isBirthday(2000,12,41);
        assertFalse(a);
        a = hw.isBirthday(2000,12,-1);
        assertFalse(a);
        a = hw.isBirthday(2000,11,41);
        assertFalse(a);
        a = hw.isBirthday(2000,11,1);
        assertTrue(a);
        a = hw.isBirthday(2000,11,-1);
        assertFalse(a);
        a = hw.isBirthday(2000,2,28);
        assertTrue(a);
        a = hw.isBirthday(2000,2,29);
        assertTrue(a);
        a = hw.isBirthday(2000,2,-1);
        assertFalse(a);
        a = hw.isBirthday(2004,2,29);
        assertTrue(a);
        a = hw.isBirthday(2004,2,30);
        assertFalse(a);
        a = hw.isBirthday(2004,2,-1);
        assertFalse(a);
        a = hw.isBirthday(2001,2,29);
        assertFalse(a);
        a = hw.isBirthday(2001,2,28);
        assertTrue(a);
        a = hw.isBirthday(2001,2,-1);
        assertFalse(a);
        a = hw.isBirthday(2001,20,1);
        assertFalse(a);
    }

    @Test
    public void miniCalculator(){
        HelloWorld hw = new HelloWorld();
        double a=hw.miniCalculator(1,1,'+');
        assertEquals(2,a,0);
        a=hw.miniCalculator(1,1,'-');
        assertEquals(0,a,0);
        a=hw.miniCalculator(1,1,'*');
        assertEquals(1,a,0);
        a=hw.miniCalculator(1,1,'/');
        assertEquals(1,a,0);
        a=hw.miniCalculator(1,1,'?');
        assertEquals(0,a,0);

    }

}
