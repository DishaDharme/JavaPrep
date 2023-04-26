package Strings_StringBuilder;

public class Performance {
    public static void main(String[] args) {
        String s="";
        for(int i=0;i<26;i++)
        {
            char ch = (char)('a'+i);
            System.out.println(ch);

            s+= ch;

        }

        System.out.println(s);

        System.out.println("a"+'b'); //if one of the datatype is string then other will also be converted to string
    }
}

