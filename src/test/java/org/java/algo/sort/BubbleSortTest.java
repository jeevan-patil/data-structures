package org.java.algo.sort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {55, 33,7, 2, 45, 76, 23, 56, 87, 2, 23, 56, 22};
        BubbleSort sort = new BubbleSort();
        int[] expected = {2, 2, 7, 22, 23, 23, 33, 45, 55, 56, 56, 76, 87};

        Assert.assertArrayEquals(expected, sort.bubbleSort(arr));
    }

}
