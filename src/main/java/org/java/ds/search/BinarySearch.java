package org.java.ds.search;

/**
 * 
 * @author jeevan
 * @date 20-Feb-2014
 * @purpose Binary search implementation.
 * 
 */
public class BinarySearch {
    public boolean contains(int[] arr, int searchNum) {
        if (arr.length == 0) {
            return false;
        }

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (searchNum == arr[middle]) {
                System.out.println(searchNum + " found at position " + (middle + 1));
                return true;
            } else if (searchNum > arr[middle]) {
                first = middle + 1;
            } else if (searchNum < arr[middle]) {
                last = middle - 1;
            }
        }
        return false;
    }
}
