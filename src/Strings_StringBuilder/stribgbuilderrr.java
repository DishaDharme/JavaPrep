package Strings_StringBuilder;

public class stribgbuilderrr {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("disha");//disha is a string of type stringbuilder
        System.out.println(sb);

        //char at index 0 (replace a character)
        System.out.println(sb.charAt(0));

        //set char at index 0

        sb.setCharAt(0,'D');
        System.out.println(sb);

        //to add a character and shift a string(not replace,just insert)

       // sb.insert(6,'D'); //gives error bcoz size is 5 and we r trying to insert at index 6
        sb.insert(2,'g');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);

        //append- to add at end
        sb.append('a');
        System.out.println(sb);

        sb.append(4);
        System.out.println(sb);

    }
}
