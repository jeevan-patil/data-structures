package org.java.algo.sort;

/**
 * 
 * @author jeevan
 * @date 21-Feb-2014
 * @purpose Bubble sort implementation.
 * 
 */
public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }

        int size = array.length;
        int i = 0, j, k = 0, temp;

        while (i < size - 1) {
            k = size - 1;
            for (j = k; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    k = j;
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            i = k;
        }

        return array;
    }
}
