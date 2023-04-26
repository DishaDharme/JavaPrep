package Strings_StringBuilder;

public class SB { // here i hve not mentiioned a Stringbuilder as a class name bcoz StringBuilder is already a class
    public static void main(String[] args) {
       StringBuilder b = new StringBuilder();
       for(int i=0;i<26;i++) {
           char ch = (char) ('a' + i);
            b.append(ch); //it is not making new object it is just changing in the original object StringBuilder that has created already
       }
        System.out.println(b);
    }
}
//StringBuilder is mutable , just like arrays u can change this also u can change
