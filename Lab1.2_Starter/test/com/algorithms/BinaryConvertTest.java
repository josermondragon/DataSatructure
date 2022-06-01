package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void convertFromOctal_shouldReturnValidDecimal_givenValidOctaString() {
        String[] testOctaStringArray = {"17", "100"};
        int[] expectedDecimalValueArray = {15, 64};

        for (int i=0; i < testOctaStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromOctal(testOctaStringArray[i]);
            Assert.assertEquals(expectedDecimalValueArray[i], resultDecimalValue);
        }

    }


    @Test(expected = NumberFormatException.class)
    public void convertFromOctal_shouldThrowException_givenOctalStringWithNoNumberChars(){
        int decimalResult = BinaryConvert.convertFromOctal("A");
        Assert.assertThrows(NumberFormatException.class, ()-> {System.out.println("No working papi");
    });
    }
}