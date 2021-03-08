package com.knoldus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxOfTwoNumbers implements MaximumInterface {
    @Override
    public int getMax(int num1, int num2) {
        int maximumNumber= Stream.of(num1, num2)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        return  maximumNumber;
    }
}