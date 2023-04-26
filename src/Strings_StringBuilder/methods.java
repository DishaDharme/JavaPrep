package Strings_StringBuilder;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name= "Disha Dharme HEllo";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); //it is going to create a new object bcoz we know strings are immutable
        System.out.println(name); //when i am printing the original string it will be the same as earlier bcoz new object is created
        System.out.println("   Disha  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
