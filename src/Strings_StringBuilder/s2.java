package Strings_StringBuilder;

public class s2 {
    public static void main(String[] args) {
        String n1="disha";
        String n2="disha";
        System.out.println(n1==n2); //here, this 2 string literals are in string pool. the reference variables n1 and n2 both are pointing to the same object therefore no separate memory address therefore value is true.


        String s1 =new String("disha");
        String s2 =new String("disha");
        System.out.println(s1==s2); //bcoz objects are different so memory address are different
        System.out.println(s1.equals(s2)); //it checks only content

        String nm1 =new String("disha");
        String nm2 =new String("disha  ");
        System.out.println(nm1==nm2); //here address are different
        System.out.println(nm1.equals(nm2)); //contents are also different

        //== : used to check address
        //.equals() : used to check content

        System.out.println(n1.charAt(0));
    }
}
