package Streams.NumberProgram;

public class PerfectNumber {
    public static void main(String[] args) {
        int number=28;
        int sum=0;

        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                sum=sum+i;
            }
        }
        if(number==sum)
        {
            System.out.println("Number is perfect Number");
        }
        else {
            System.out.println("Number is not perfect Number");
        }
    }
}
