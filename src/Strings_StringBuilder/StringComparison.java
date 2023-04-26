package Strings_StringBuilder;

public class StringComparison {
    public static void main(String[] args) {
        String one="sish";
        String two="uhjk";
        if(one.compareTo(two)==0)
        {
            System.out.println("strings are equal");
        }
        else if(one.compareTo(two)>0) //if(one>two) then return one
        {
            System.out.println("greater string is" +one);
        }
        else
        {
            System.out.println(("greater string is" + two)); //else return two
        }
    }
}
