package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatTwoStrings {

    //Write a Java program to concatenate two strings.
    //Input: "Hello", "World"
    //Expected Output: "HelloWorld"

    @Test
    public void Test1()
    {
        Assert.assertEquals(concatTwoStrings1("Hello","World"),"HelloWorld");
        Assert.assertEquals(concatTwoStrings1("Hello",""),"Hello");
        Assert.assertEquals(concatTwoStrings1("","World"),"World");
        Assert.assertEquals(concatTwoStrings1("",""),"");
    }

    @Test
    public void Test2()
    {
        Assert.assertEquals(concatTwoStrings2("Hello","World"),"HelloWorld");
        Assert.assertEquals(concatTwoStrings2("Hello",""),"Hello");
        Assert.assertEquals(concatTwoStrings2("","World"),"World");
        Assert.assertEquals(concatTwoStrings2("",""),"");
    }

    public String concatTwoStrings1(String str1, String str2)
    {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            result += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            result += str2.charAt(i);
        }
        System.out.println(result);
        return result;
    }
    public String concatTwoStrings2(String str1, String str2)
    {
        //concat() method also works
        //System.out.println(str1.concat(str2));
        return str1+str2;
    }
}
