package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceSpecificChar {

    //Write a Java program to replace a specific character in a string.
    //Input: "Hello", 'l', 'w'
    //Expected Output: "Hewwo"

    @Test
    public void Test()
    {
        Assert.assertEquals(replaceSpecialChar("Hello",'l','w'),"Hewwo");
    }

    public String replaceSpecialChar(String str, char oldChar, char newChar)
    {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldChar)
                arr[i] = newChar;
        }
        return new String(arr);
    }
}
