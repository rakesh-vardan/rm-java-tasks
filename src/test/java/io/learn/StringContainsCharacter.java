package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringContainsCharacter {

//    Write a Java program to check if a string contains a certain character.
//    Input: "Hello", 'o'
//    Expected Output: "The string contains the character 'o'"

    @Test
    public void Test()
    {
        Assert.assertTrue(stringContainsChar("Hello", 'o'));
        Assert.assertFalse(stringContainsChar("Hello", 'h'));
    }

    public boolean stringContainsChar(String str, char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                return true;
        }
        return false;
    }
}
