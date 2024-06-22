package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReverseString {
    //Write a Java program to reverse a given string.
    //Input: "Hello World"
    //Expected Output: "dlroW olleH"

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void testReverse1()
    {
        softAssert.assertEquals(reverse1("Hello World"),"dlroW olleH");
        softAssert.assertEquals(reverse1("   Ra h u l  "),"  l u h aR   ");
        softAssert.assertEquals(reverse1(""),"");
        softAssert.assertAll();
    }
    @Test
    public void testReverse2()
    {
        softAssert.assertEquals(reverse2("Hello World"),"dlroW olleH");
        softAssert.assertEquals(reverse2("   Ra h u l  "),"  l u h aR   ");
        softAssert.assertEquals(reverse2(""),"");
        softAssert.assertAll();
    }
    public String reverse1(String str)
    {
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
               result = result + str.charAt(i);
        }
        System.out.println(result);
        return result;
    }

    public String reverse2(String str)
    {
        String result = "";
        char[] arr = str.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
        {
         result = result + arr[i];
        }
        return result;
    }
}
