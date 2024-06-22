package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveAllWhiteSpaces {
    //Write a Java program to remove all white spaces from a string.
    //Input: "Hello World"
    //Expected Output: "HelloWorld"
    @Test
    public void Test()
    {
        Assert.assertEquals(removeAllWhiteSpaces("Hello  World"),"HelloWorld");
        Assert.assertEquals(removeAllWhiteSpaces("  H  el lo  W o r l d   "),"HelloWorld");
        Assert.assertEquals(removeAllWhiteSpaces("  "),"");
        Assert.assertEquals(removeAllWhiteSpaces(""),"");

    }

    public String removeAllWhiteSpaces(String str)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ')
                result += str.charAt(i);
        }
        return result;
    }


}
