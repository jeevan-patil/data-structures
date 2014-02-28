package org.java.algo.sort;

public class SelectionSort {
    /**
     * @author Hrishikesh
     * @date 27-Feb-2014 
     * @purpose Selection sort implementation
     * @param array
     * @return
     */
	
	public int[] selectionSort(int[] array) {

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
					array[i] ^= array[j];   			// example array[i] = 20, array[j] = 10, here result is array[i] = 30   
					array[j] = array[i] ^ array[j];		// Here result is array[j] = 20 
					array[i] ^= array[j];				// Here result is array[i] = 10
				}
			}
		}
		
		return array;
	}
}
