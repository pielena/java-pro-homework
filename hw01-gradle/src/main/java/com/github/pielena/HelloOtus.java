package com.github.pielena;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

public class HelloOtus {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        int min = 0;
        int max = 100;

        for (int i = min; i < max; i++) {
            values.add(i);
        }

        Predicate<Integer> eachThirdOut = integer -> integer%3 != 0;

        Iterable<Integer> result = Iterables.filter(values, eachThirdOut);

        System.out.println(result);
    }
}
