package org.webler.zsolt.debug;

public class BuggyCode_2 {


    public static void main(String[] args) {
        String text = "Hello, world!";

        String reversedText = reverseText(text);
        System.out.println("The reversed text is: " + reversedText);
    }

    public static String reverseText(String str) {
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }


}
