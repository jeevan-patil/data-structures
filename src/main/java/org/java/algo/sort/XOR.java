package org.java.algo.sort;

public class XOR {

    public int findSingleOdd(int[] array) {
        int res = 0;
        for (int i : array) {
            res = res ^ i;
        }
        return res;
    }
}
