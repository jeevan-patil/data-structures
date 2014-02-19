package org.java.ds.search;

/**
 * 
 * @author jeevan
 * @date 20-Feb-2014
 * @purpose Binary search implementation. We expect input array to be in sorted order.
 * 
 */
public class BinarySearch {
    public int contains(int[] arr, int searchNum) {
        int KEY_NOT_FOUND = -1;

        if (arr.length == 0) {
            return KEY_NOT_FOUND;
        }

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            // Search key is in arr[first..last] or not present.
            int middle = (first + last) / 2;
            if (searchNum == arr[middle]) {
                return middle + 1;
            } else if (searchNum > arr[middle]) {
                first = middle + 1;
            } else if (searchNum < arr[middle]) {
                last = middle - 1;
            }
        }

        return KEY_NOT_FOUND;
    }
}
