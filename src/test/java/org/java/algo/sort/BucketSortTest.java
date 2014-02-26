package org.java.algo.sort;

import org.junit.Assert;
import org.junit.Test;

public class BucketSortTest {

    @Test
    public void testBucketSort() {
        int[] arr = { 2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0 };
        int[] expected = { 0, 1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 7, 8 };
        BucketSort sort = new BucketSort();
        Assert.assertArrayEquals(expected, sort.sort(arr, 0, 8));
    }
}
