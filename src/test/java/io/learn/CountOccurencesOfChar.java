package io.learn;

import org.testng.annotations.Test;

public class CountOccurencesOfChar {

    //Write a Java program to count the occurrences of a character in a string.
    //Input: "Hello", 'l'
    //Expected Output: "2"

    @Test
    public void Test()
    {
        countOccurences("Hello",'l');
        countOccurences("HHHHH",'l');
        countOccurences("HHHHH",'H');
        countOccurences("Hello",' ');
    }

    public int countOccurences(String str, char ch)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch)
                count++;
        }
        System.out.println(count);
        return count;
    }
}
