package org.java.algo.sort;

import org.junit.Test;

import junit.framework.Assert;

public class XORTest {

    @Test
    public void findSingleOdd() {
        int[] arr = {1,2,3,4,5,6,1,2,3,4,5};
        XOR xor = new XOR();
        Assert.assertEquals(6, xor.findSingleOdd(arr));
    }
}
