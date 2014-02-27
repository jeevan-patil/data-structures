package org.java.algo.sort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {
	
	@Test
	public void testSelectionSort() {
		int testCase[] = {3, 5, 2, 9, 1};
		SelectionSort sorter = new SelectionSort();
		int expected[] = {1, 2, 3, 5, 9};
		Assert.assertArrayEquals(expected, sorter.selectionSort(testCase));
		Assert.assertArrayEquals(expected, sorter.shortSelectionSort(testCase));
	}
}
