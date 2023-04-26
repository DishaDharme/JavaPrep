package Strings_StringBuilder;

public class stringReverse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("disha");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front); //front character
            char backchaar=sb.charAt(back);

            sb.setCharAt(front,backchaar);
            sb.setCharAt(back,frontChar);


        }
        System.out.println(sb);
    }
}
