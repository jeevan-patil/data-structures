package org.java.algo.search;

/**
 * 
 * @author jeevan
 * @date 20-Feb-2014
 * @purpose Binary search implementation. We expect input array to be in sorted order.
 * 
 */
public class BinarySearch {
    private final int KEY_NOT_FOUND = -1;

    /**
     * @purpose 
     * 
     * @param arr
     * @param searchNum
     * @return index of key in array, returns -1 if key not found.
     */
    public int contains(int[] arr, int searchNum) {

        if (arr.length == 0) {
            return KEY_NOT_FOUND;
        }

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            // Search key is in arr[first..last] or not present.
            int middle = (first + last) / 2;
            if (searchNum == arr[middle]) {
                return (middle + 1);
            } else if (searchNum > arr[middle]) {
                first = (middle + 1);
            } else if (searchNum < arr[middle]) {
                last = (middle - 1);
            }
        }

        return KEY_NOT_FOUND;
    }

    /**
     * @purpose Binary using recursive search
     * 
     * @param arr
     * @param start
     * @param end
     * @param key
     * @return index of key in array, returns -1 if key not found.
     */
    public int recursiveBinarySearch(int[] arr, int first, int last, int key) {        
        if(first < last) {
            int middle = (first + last) / 2;
            if(key == arr[middle]) {
                return (middle + 1);
            } else if(key < arr[middle]) {
                return recursiveBinarySearch(arr, first, middle, key);
            } else if(key > arr[middle]) {
                return recursiveBinarySearch(arr, (middle + 1), last, key);
            }
        }

        return KEY_NOT_FOUND;
    }
}
