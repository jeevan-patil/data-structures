package org.java.algo.search;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void simpleBinarySearch() {
        BinarySearch binary = new BinarySearch();
        int[] array = { 10, 4, 5, 2, 3, 6, 8, 7, 9, 1 };
        Arrays.sort(array);
        Assert.assertEquals(binary.contains(array, 6), 6);
        Assert.assertEquals(binary.contains(array, 10), 10);
        Assert.assertEquals(binary.contains(array, 5), 5);
        Assert.assertEquals(binary.contains(array, 11), -1);
    }
    
    @Test
    public void recursiveBinarySearch() {
        BinarySearch binary = new BinarySearch();
        int[] array = { 10, 4, 5, 2, 3, 6, 8, 7, 9, 1 };
        Arrays.sort(array);
        int first = 0;
        int last = array.length;

        Assert.assertEquals(binary.recursiveBinarySearch(array, first, last, 6), 6);
        Assert.assertEquals(binary.recursiveBinarySearch(array, first, last, 10), 10);
        Assert.assertEquals(binary.recursiveBinarySearch(array, first, last, 5), 5);
        Assert.assertEquals(binary.recursiveBinarySearch(array, first, last, 11), -1);
    }

}
