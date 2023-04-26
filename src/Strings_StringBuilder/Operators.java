package Strings_StringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1); //integer will be converted to its wrapper class Integer that will call toString()

        System.out.println("Disha" + new ArrayList<>()); //initially arraylist is empty
        System.out.println("Disha" + new Integer((56))); //here is object

     //   System.out.println(new Integer(56) + new ArrayList<>());
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
//Simple thing to remeeber: if there is an object , there is calling to toString()
// + : + in java U can only use it with primitiives
// and other condition is U can use it with all  the complex objects as well but the only condition is at least one of these objects is of type String

//"" : this is also a complex object of type string
// + : is the onlly operator u can overload in java to support String concatenation