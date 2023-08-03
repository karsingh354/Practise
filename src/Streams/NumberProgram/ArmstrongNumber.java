package Streams.NumberProgram;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int remender,number=153,sum=0;
        int temp=number;
        while(number!=0)
        {
            remender=number%10;
            number=number*10;
            sum=sum+(remender*remender*remender);
        }
        if(temp==sum)
        {
            System.out.println("Number is Armstrong Number");
        }
        else {
            System.out.println("Number is Armstrong Number");
        }
    }
}
