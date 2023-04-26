package Strings_StringBuilder;

import java.lang.ref.SoftReference;

public class substringRemove {
    public static void main(String[] args) {
        String name="my name is disha";
        String mynME=name.substring(11,name.length()); //ending index is exclusive. if we pass(0,4) then it will consider 0 to 3, not 4.
        System.out.println(mynME);
        System.out.println(name);
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(8));
    }
}
