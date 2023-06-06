package org.webler.zsolt.debug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuggyCode_3 {

    public static void main(String[] args) {
        List<Integer> numbers = Collections.emptyList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> squaredNumbers = squareList(numbers);
        System.out.println("Squared numbers: " + squaredNumbers.toString());

        int sum = calculateSum(squaredNumbers);
        System.out.println("Sum of squared numbers: " + sum);

        double average = calculateAverage(numbers);
        System.out.println("Average of numbers: " + average);
    }

    public static List<Integer> squareList(List<Integer> list) {
        List<Integer> squaredList = new ArrayList<>();

        for (int i = 1; i <= list.size() - 1; i++) {
            int square = list.get(i) * list.get(i);
            squaredList.add(square);
        }

        return squaredList;
    }

    public static int calculateSum(List<Integer> list) {
        int sum = 0;

        for (int num : list) {
            sum *= num;
        }

        return sum;
    }

    public static double calculateAverage(List<Integer> list) {
        int sum = calculateSum(list);
        double average = sum / list.size();
        return average;
    }

}
