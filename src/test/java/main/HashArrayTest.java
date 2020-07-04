/*package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashArrayTest {

    private final int size = 7;

    private HashArray testUnderClass;

    @Before
    public void setup() {
        testUnderClass = new HashArray(size);
    }

    @After
    public void teardown() {

    }

    @Test
    public void testClearMethod() {
        for (int i = 0; i  < size; i++) {
            int number = i + 1;
            testUnderClass.set(i, number);
            Assert.assertEquals(number, testUnderClass.get(i));
            Assert.assertEquals(false, testUnderClass.isFree(i));
        }
        testUnderClass.clear();
        for (int i = 0; i  < size; i++) {
            Assert.assertEquals(true, testUnderClass.isFree(i));
        }
    }

    @Test
    public void testMarkAsDeletedMethod() {
        testUnderClass.set(0, 10);
        testUnderClass.markAsDeleted(0);
        Assert.assertEquals(true, testUnderClass.isMarkAsDeleted(0));
        Assert.assertEquals(Integer.MIN_VALUE, testUnderClass.get(0));
    }

    @Test
    public void testCompareKeysMethod() {
        testUnderClass.set(0, 10);
        Assert.assertEquals(true, testUnderClass.compareKeys(0, 10));
        Assert.assertEquals(false, testUnderClass.compareKeys(0, 11));
    }

    @Test
    public void testToStringMethod() {
        String expectedText = "[**, **, **, **, **, **, **, ]";
        Assert.assertEquals(expectedText, testUnderClass.toString());

        testUnderClass.set(0, 10);
        testUnderClass.set(3, 20);
        Assert.assertEquals("[10, **, **, 20, **, **, **, ]", testUnderClass.toString());

        testUnderClass.markAsDeleted(3);
        Assert.assertEquals("[10, **, **, ##, **, **, **, ]", testUnderClass.toString());
    }

}
*/