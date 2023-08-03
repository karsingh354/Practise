package Streams.NumberProgram;

public class ReverseNumber {
    public static void main(String[] args) {
        int remender,number=12345,sum=0;
        while(number!=0)
        {
            remender=number%10;
            sum=sum*10+(remender);
            number=number/10;
        }
        System.out.println(sum);
    }
}
