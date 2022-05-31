package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void main() {
    }

    @Test
    public void convertFromBinary_shouldReturnValidDecimal_givenValidBinaryString() {

        //int decimalResult = BinaryConvert.convertFromBinary("10010");
        //Assert.assertEquals(18, decimalResult);

        //int decimalResult = BinaryConvert.convertFromBinary("10");
        //Assert.assertEquals(2, decimalResult);

        //to test more than one at the same time lets do it this way:

        String[] testBinaryStringArray = {"10010","10"};
        int[] expectedDecimalValueArray = {18,2};

        for (int i=0; i< testBinaryStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromBinary(testBinaryStringArray[i]);
            Assert.assertEquals(expectedDecimalValueArray[i], resultDecimalValue);

        }
    }
}