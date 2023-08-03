package Streams.NumberProgram;

public class FindMaximumNumber {
    public static void main(String[] args) {
        int arr[]={1,4,7,2,4,10,80};
        int max=0;

        for(int i=0;i< arr.length;i++)
        {
            //int max=arr[i];
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}
