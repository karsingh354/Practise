package Streams.ThreadConcepByRunnableInterface;

public class RunnableInteface implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
