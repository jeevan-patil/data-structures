package org.java.algo.sort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {
	
	@Test
	public void testSelectionSort() {
		int testCase[] = { 2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0 };
		int expected[] = { 0, 1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 7, 8 };
		SelectionSort sorter = new SelectionSort();
		
		Assert.assertArrayEquals(expected, sorter.selectionSort1(testCase));
		Assert.assertArrayEquals(expected, sorter.selectionSort2(testCase));
		Assert.assertArrayEquals(expected, sorter.shortSelectionSort(testCase));
	}
}
