package io.learn;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CountVowels {
    //Write a Java program to count the number of vowels and consonants in a given string.
    //Input: "Hello"
    //Expected Output: "Number of vowels: 2, Number of consonants: 3"

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test1()
    {
        countVowels1("Hello");
        countVowels1("Pe@Fi*^&v");
    }
    @Test
    public void test2()
    {
        countVowels2("Hello");
        countVowels2("Pe@Fi*^&v");
    }

    public void countVowels1(String str)
    {
        int vowelsCount=0;
        int consCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch){
                case 'a'|'A' : vowelsCount++; break;
                case 'e'|'E' : vowelsCount++; break;
                case 'i'|'I' : vowelsCount++; break;
                case 'o'|'O' : vowelsCount++; break;
                case 'u'|'U' : vowelsCount++; break;
                default:
                    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){consCount++;}
            }
        }
        System.out.println("Number of vowels: "+vowelsCount);
        System.out.println("Number of consonants: "+consCount);
    }

    public void countVowels2(String str)
    {
        int vowelsCount=0;
        int consCount = 0;
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowelsCount++;
            else if (ch>='a' && ch<='z')
                consCount++;

        }
        System.out.println("Number of vowels: "+vowelsCount);
        System.out.println("Number of consonants: "+consCount);
    }
}
