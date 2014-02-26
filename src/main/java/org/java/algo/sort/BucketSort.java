package org.java.algo.sort;

/**
 * 
 * @author jeevan
 * @date 25-Feb-2014
 * @purpose 
 *
 */
public class BucketSort {

    /**
     * 
     * @purpose Bucket Sort
     * 
     * @param array
     * @param min
     * @param max
     * @return
     */
    public int[] sort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] result = new int[range];

        for(int i : array) {
            result[i]++;
        }

        return result;
    }    
}
