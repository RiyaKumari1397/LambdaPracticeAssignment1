package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfTwoNumbersTest {

    MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();

    @Test
    void validInputs() {
        int test1 = maxOfTwoNumbers.getMax(5,2);
        Assertions.assertEquals(5,test1);
    }
    @Test
    void invalidInputs() {
        int test2 = maxOfTwoNumbers.getMax(-6,2);
        Assertions.assertNotEquals(-6,test2);
    }
    @Test
    void equalInputs() {
        int test3 = maxOfTwoNumbers.getMax(6,6);
        Assertions.assertEquals(6,test3);
    }
}