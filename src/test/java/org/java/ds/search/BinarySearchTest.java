package org.java.ds.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void searchArray() {
        BinarySearch binary = new BinarySearch();
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Assert.assertTrue(binary.contains(array, 6));
        Assert.assertTrue(binary.contains(array, 10));
        Assert.assertTrue(binary.contains(array, 5));
        Assert.assertFalse(binary.contains(array, 11));
    }

}
