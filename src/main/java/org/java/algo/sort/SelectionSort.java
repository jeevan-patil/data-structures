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
	
	/*Method swap the content without using third 'temp' variable*/
	public int[] shortSelectionSort(int[] array) {

		for(int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j > i; j--) {
				if(array[i] > array[j]) {
					array[i] ^= array[j];
					array[j] = array[i] ^ array[j];
					array[i] ^= array[j];
				}
			}
		}
		
		return array;
	}
}
