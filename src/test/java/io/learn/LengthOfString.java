package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LengthOfString {

    //Write a Java program to find the length of a string without using the built-in function.
    //Input: "Hello"
    //Expected Output: "5"

    @Test
    public void Test()
    {
        Assert.assertEquals(lengthOfString("HelloWorld"),10);
        Assert.assertEquals(lengthOfString("Hello  World"),12);
        Assert.assertEquals(lengthOfString(""),0);

    }

    public int lengthOfString(String str)
    {
        int count=0;
        char[] arr = str.toCharArray();
        for(char ch:arr)
            count++;
        System.out.println(count);
        return count;
    }
}
