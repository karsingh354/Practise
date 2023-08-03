package Streams.NumberProgram;

public class PalindromeNumber {
    public static void main(String[] args) {
        int remender,number=121,sum=0;
        int temp=number;
        while(number!=0)
        {
           remender=number%10;
           sum=sum*10+remender;
           number=number/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
