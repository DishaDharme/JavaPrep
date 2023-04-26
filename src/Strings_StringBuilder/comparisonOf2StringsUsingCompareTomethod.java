package Strings_StringBuilder;

import java.util.SplittableRandom;

public class comparisonOf2StringsUsingCompareTomethod {
    public static void main(String[] args) {
        String one = "disha";
        String two = "Disha";

        if(one.compareTo(two)==0)
        {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
