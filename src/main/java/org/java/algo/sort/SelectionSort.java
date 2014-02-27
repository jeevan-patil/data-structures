package org.java.algo.sort;

/**
 * 
 * @author jeevan
 * @date 28-Feb-2014
 * @purpose Selection Sort
 * 
 */
public class SelectionSort {

    public int[] selectionSort(int[] array) {

        if (array.length == 0) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
                if (min_index != i) {
                    int temp = array[i];
                    array[i] = array[min_index];
                    array[min_index] = temp;
                }
            }
        }
        return array;
    }
}
