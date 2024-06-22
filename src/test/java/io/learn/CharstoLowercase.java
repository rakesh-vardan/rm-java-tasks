package io.learn;

import org.testng.annotations.Test;

public class CharstoLowercase {
//    Write a Java program to convert all the characters in a string to lowercase.
//    Input: "JAVA Programming"
//    Expected Output: "java programming"

    @Test
    public void test()
    {
        toLowerCase("JAVA Programming");
        toLowerCase("ABCDEFGHIJ");
    }
    public void toLowerCase(String str)
    {
        String result = "";
        // ASCII Values: A-Z -> 65-90 | a-z -> 97-122
        // 65(A) + 32 = 97(a)
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90)
                result = result + (char)(ch+32);
            else
                result = result + ch;
        }
        System.out.println(result);
    }
}
