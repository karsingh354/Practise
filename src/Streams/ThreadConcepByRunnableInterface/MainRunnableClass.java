package Streams.ThreadConcepByRunnableInterface;

public class MainRunnableClass {
    public static void main(String[] args) {
        RunnableInteface rn=new RunnableInteface();
        Thread th=new Thread(rn);
         th.start();
    }
}
