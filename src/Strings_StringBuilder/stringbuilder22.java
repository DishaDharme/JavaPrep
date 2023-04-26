package Strings_StringBuilder;

public class stringbuilder22 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("d");
        sb.append("i");   //str=str+"i";
        sb.append("s");   //str=str+"s"; //it is taking more time thats why stringbuilder has been introduced
        sb.append("h");
        sb.append("a");

        System.out.println(sb);
    }
}
