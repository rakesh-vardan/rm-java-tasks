# Questions:

### Easy:
1. Write a Java program to reverse a given string.
    - Input: "Hello World"
    - Expected Output: "dlroW olleH"
2. Write a Java program to count the number of vowels and consonants in a given string.
    - Input: "Hello"
    - Expected Output: "Number of vowels: 2, Number of consonants: 3"
3. Write a Java program to convert all the characters in a string to lowercase.
    - Input: "JAVA Programming"
    - Expected Output: "java programming"
4. Write a Java program to check if a string contains a certain character.
    - Input: "Hello", 'o'
    - Expected Output: "The string contains the character 'o'"
5. Write a Java program to remove all white spaces from a string.
    - Input: "Hello World"
    - Expected Output: "HelloWorld"
6. Write a Java program to concatenate two strings.
    - Input: "Hello", "World"
    - Expected Output: "HelloWorld"
7. Write a Java program to find the length of a string without using the built-in function.
    - Input: "Hello"
    - Expected Output: "5"
8. Write a Java program to replace a specific character in a string.
    - Input: "Hello", 'l', 'w'
    - Expected Output: "Hewwo"
9. Write a Java program to count the occurrences of a character in a string.
    - Input: "Hello", 'l'
    - Expected Output: "2"
10. Write a Java program to find the frequency of each character in a string.
    - Input: "Hello"
    - Expected Output: "H: 1, e: 1, l: 2, o: 1"
11. Write a Java program to check if a string only contains numeric characters.
    - Input: "12345"
    - Expected Output: "The string only contains numeric characters"
12. Write a Java program to split a string with a given delimiter.
    - Input: "Java-Programming-Language", "-"
    - Expected Output: ["Java", "Programming", "Language"]

### Medium:
1. Write a Java program to check if a given string is a palindrome or not.
    - Input: "madam"
    - Expected Output: "The string is a palindrome"
2. Write a Java program to find the longest substring without repeating characters in a given string.
    - Input: "javaconceptoftheday"
    - Expected Output: "conceptofthday"
3. Write a Java program to check if two given strings are anagrams of each other.
    - Input: "listen", "silent"
    - Expected Output: "The strings are anagrams"
4. Write a Java program to find the duplicate characters in a string.
    - Input: "Programming"
    - Expected Output: "g, m"
5. Write a Java program to check if a string is a rotation of another.
    - Input: "abcde", "cdeab"
    - Expected Output: "The string 'cdeab' is a rotation of 'abcde'"
6. Write a Java program to convert a given string into an array of words.
    - Input: "Java is a programming language"
    - Expected Output: ["Java", "is", "a", "programming", "language"]
7. Write a Java program to remove duplicate characters from a string.
    - Input: "Programming"
    - Expected Output: "Programing"
8. Write a Java program to find the first non-repeating character in a string.
    - Input: "Programming"
    - Expected Output: "P"
9. Write a Java program to convert a string to an integer without using the built-in function.
    - Input: "12345"
    - Expected Output: 12345
10. Write a Java program to find the second most frequent character in a string.
    - Input: "Programming"
    - Expected Output: "r"
11. Write a Java program to check if a string is a valid shuffle of two other strings.
    - Input: "1A2B", "1B", "A2"
    - Expected Output: "The string is a valid shuffle"
12. Write a Java program to find the longest common prefix among a set of strings.
    - Input: ["flower","flow","flight"]
    - Expected Output: "fl"
13. Write a Java program to find the most frequent character in a string.
    - Input: "Programming"
    - Expected Output: "g"
14. Write a Java program to find the least frequent character in a string.
    - Input: "Programming"
    - Expected Output: "P"
15. Write a Java program to convert a string to a byte array and vice versa.
    - Input: "Hello"
    - Expected Output: [72, 101, 108, 108, 111] and "Hello"

### Hard:
1. Write a Java program to find the smallest window in a string containing all characters of another string.
    - Input: "this is a test string", "tist"
    - Expected Output: "t stri"
2. Write a Java program to find all permutations of a given string.
    - Input: "abc"
    - Expected Output: "abc, acb, bac, bca, cab, cba"
3. Write a Java program that implements the KMP (Knuth Morris Pratt) algorithm for pattern searching in a given string.
    - Input: "ABABDABACDABABCABAB", "ABABCABAB"
    - Expected Output: "Pattern found at index: 10"
4. Write a Java program to find the longest palindromic substring in a string.
    - Input: "babad"
    - Expected Output: "bab"
5. Write a Java program to implement a Trie data structure for efficient string retrieval. Implement methods to insert a string and search for a string in the Trie.
    - Input: Insert "hello", Search "hell"
    - Expected Output: "String found"
6. Write a Java program to implement the Boyer-Moore algorithm for pattern searching in a string.
    - Input: "ABAAABCD", "ABC"
    - Expected Output: "Pattern found at index: 4"
7. Write a Java program to implement a string compression algorithm. For example, the string "aaabbbccc" would become "a3b3c3". If the compressed string is not smaller than the original string, return the original string.
    - Input: "aaabbbccc"
    - Expected Output: "a3b3c3"
8. Write a Java program to implement a string decompression algorithm. For example, the string "a3b3c3" would become "aaabbbccc".
    - Input: "a3b3c3"
    - Expected Output: "aaabbbccc"
9. Write a Java program to implement the Rabin-Karp algorithm for pattern searching in a string.
    - Input: "ABABDABACDABABCABAB", "ABABCABAB"
    - Expected Output: "Pattern found at index: 10"
10. Write a Java program to implement a regular expression matching algorithm. The algorithm should support '.' (any character) and '*' (zero or more of the preceding element).
    - Input: "aab", "c*a*b"
    - Expected Output: "Match found"
11. Write a Java program to implement the Z algorithm for pattern searching in a string.
    - Input: "ABABDABACDABABCABAB", "ABABCABAB"
    - Expected Output: "Pattern found at index: 10"
12. Write a Java program to implement the Aho-Corasick algorithm for pattern searching in a string.
    - Input: "ahishers", ["he", "she", "hers", "his"]
    - Expected Output: "Pattern 'he' found at index: 1, Pattern 'she' found at index: 1, Pattern 'hers' found at index: 4, Pattern 'his' found at index: 0"
13. Write a Java program to implement the Manacher's algorithm to find the longest palindromic substring in a string.
    - Input: "babad"
    - Expected Output: "bab"
14. Write a Java program to implement the Levenshtein distance algorithm to find the minimum number of single-character edits (insertions, deletions or substitutions) required to change one string into the other.
    - Input: "kitten", "sitting"
    - Expected Output: "3"
15. Write a Java program to implement the BWT (Burrows-Wheeler Transform) and its inverse for string manipulation.
    - Input: "banana"
    - Expected Output: "annb$aa" and "banana"