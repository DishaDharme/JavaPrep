package Strings_StringBuilder;

import java.util.Locale;

public class StringPalindrome {
    public static void main(String[] args) {

     // System.out.println( isPalin("Disid"));
      //  System.out.println( isPalin("D"));
        System.out.println( isPalin(""));

    }
    static boolean isPalin(String str)
    {
        if(str == null || str.length()==0)
        {
            return true;
        }
        for(int i=0;i<str.length()/2;i++)
        {
            str=str.toLowerCase();
            char start=str.charAt(i);
            char end=str.charAt((str.length()-1-i));

            if(start != end)
            {
                return false;
            }

        }
        return true;
    }
}
