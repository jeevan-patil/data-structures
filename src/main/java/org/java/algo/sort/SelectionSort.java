package org.java.algo.sort;

public class SelectionSort {
    /**
     * @author Jeevan, Hrishikesh
     * @date 27-Feb-2014 
     * @purpose Selection sort implementation
     * @param array
     * @return
     */

    public int[] selectionSort1(int[] array) {

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

	public int[] selectionSort2(int[] array) {

		for(int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j > i; j--) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}

	/*Method swap the content without using third variable 'temp'*/
	/*For python swapping is very simple. like array[i], array[j] = array[j], array[i]*/
	public int[] shortSelectionSort(int[] array) {

		for(int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j > i; j--) {
				if(array[i] > array[j]) {
					array[i] ^= array[j];   			// example: array[i] = 20, array[j] = 10, here result is array[i] = 30   
					array[j] = array[i] ^ array[j];		// Here result is array[j] = 20 
					array[i] ^= array[j];				// Here result is array[i] = 10
				}
			}
		}
		
		return array;
	}
}