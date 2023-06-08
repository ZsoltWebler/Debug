package org.webler.zsolt.debug;

public class BuggyCode_1 {


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        int product = multiplyNumbers(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);


    }

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int multiplyNumbers(int a, int b) {
        int product = a * b;
        return product;
    }


}
