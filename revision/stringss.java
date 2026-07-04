import java.util.*;
public class stringss {
    // static int getStringLength(String str){
    //     int count = 0;
    //     char str1[] = str.toCharArray();
    //     for(char val: str1){
    //         count++;
    //     }
    //     return count;
    // }

    //OR
    static int getStringLength(String str){
        char str1[] = str.toCharArray();
        int len = str1.length;
        return len;
    }

    //reverse a string
    static String reverseString(String str){
        String rev = "";
        for(int i =str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    //count vowels in a string using array when length is not counted using .length()
    // static int countStringVowels(String str){
    //     int count = 0;
    //     char[] arr = str.toCharArray();
    //     for(char val: arr){
    //         if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u'){
    //             count++;
    //         }
    //     }
    //     return count; 
    // }

    //OR
    static int countStringVowels(String str){
        int count = 0;
        for(int val = 0; val<str.length(); val++){
            char c = str.charAt(val);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count; 
    }

    static boolean isPalinndrome(String str){
        String rev = reverseString(str);
        if(str.equals(rev)){
            return true;
        } else {
            return false;
        }
    }

    //count consonants in a string
    static int countStringConsonants(String str){
        int count = 0;
        for(int val = 0; val<str.length(); val++){
            char c = str.charAt(val);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                count++;
            }
        }
        return count; 
    }

    //string to uppercase without using method
    static String toUpperCase(String str){
        String upper = "";
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            // char change = (char)(c-32);
            if(c >= 'a' && c <= 'z'){
                c = (char)(c - 32);
            }
            upper = upper + c;
        }
        return upper;
    }

    //frequency of a character
    static int countFrequency(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    //Remove all spaces from string
    static String removeSpaces(String str){
        String ans = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                continue;
            } else {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    //Check if string contains only digits
    static boolean containsOnlyDigits(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' ){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    //Count words in a sentence
    static int countWords(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        //creating a string varaible using two methods
        //met-1 normal defining
        // String str = "Hello";
        // System.out.println(str);

        //meth-2 using new keyword
        // String str1 = new String("Saumya");
        // System.out.println(str1);

        //concatenation of strings
        // System.out.println(str + " " + str1);

        //some predefined methods of string like - length(), charAt()

        //length method
        // System.out.println(str.length());

        //charAt keyword
        // System.out.println(str1.charAt(4));

        //string is immutable
        // String str = "Hello";
        // str[2] = "e";
        // str = "Morning";
        // System.out.println(str);
        // String strr = "hello";

        //checked the address of two strings poitning to same address in string pool
        //==
        // if(str == strr){
        //     System.out.println("Strings are equal");
        // }else {
        //     System.out.println("not equal");
        // }

        //using .equals()
        // System.out.println(str.equals(strr));

        //using .equalsIgnoreCase()
        // System.out.println(str.equalsIgnoreCase(strr));

        //taking input in string
        Scanner sc = new Scanner(System.in);

        //using next()
        // String str = sc.next();
        // System.out.println(str);

        //using nextLine()
        // String str = sc.nextLine();
        // System.out.println(str);

        //trying common string methods

        //.isEmpty
        // System.out.println(str.isEmpty());
        

        //.isBlank()
        // System.out.println(str.isBlank());

        //trim()
        // String name = "  Aditya   ";
        // name  = name.trim();
        // System.out.println(name.length());


        //lowercase & uppercase
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());

        //substring
        // String word = "Hello my name is java";
        // System.out.println(word.substring(3, 9));

        //contains
        // System.out.println(word.contains("saumya"));

        //valueOf
        // int num = 100293;
        // String data = String.valueOf(num);
        // System.out.println(data+"hello");

        //startsWith & endsWith
        // System.out.println(word.startsWith("S"));
        // System.out.println(word.endsWith("y"));

        //toCharArray()
        // String name = "Hello";
        // char array[] = name.toCharArray();
        // for(char val: array){
        //     System.out.print(val + " ");
        // }

        //split()
        // String words = "My, name, is saumya, jain";
        // String arr[] = words.split(",");
        // for(String val: arr){
        //     System.out.print(val + " ");
        // }

        //replace()
        // String names = "Saumya";
        // System.out.println(names.replace("a", "w"));

        //practice questions

        //print all the characters of a string
        String name = "saumyajain";
        // for(int i = 0; i<name.length(); i++){
        //     System.out.print(name.charAt(i) + " ");
        // }

        //count length of string without length()
        // int count = 0;
        // char str[] = name.toCharArray();
        // for(char val: str){
        //     count++;
        // }
        // System.out.println(count);
        // int cnt = getStringLength(name);
        // System.out.println(cnt);

        //count vowel function calling
        // int vowelCount = countStringVowels(name);
        // System.out.println(vowelCount);

        //reverse a string
        // String str = "Saumya";
        // String ret = reverseString(str);
        // System.out.println(ret);

        //palindrome
        // String str = "noon";
        // System.out.println(isPalinndrome(str));

        //string homework

        //pg-1
        // int ans = countStringConsonants(name);
        // System.out.println(ans);

        //pg-2
        // String upper = toUpperCase(name);
        // System.out.println(upper);

        //pg-3
        // int ans = countFrequency(name, 'a');
        // System.out.println(ans);

        //pg-4
        // String letters = "  Lo  ve l   y";
        // String ans = removeSpaces(letters);
        // System.out.println(ans);

        //pg-5
        // String word = "12a45";
        // System.out.println(containsOnlyDigits(word));

        //pg-6
        String sentence = "Did I find a space";
        int ans = countWords(sentence);
        System.out.println(ans);
    }
}
