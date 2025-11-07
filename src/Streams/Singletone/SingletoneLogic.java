package Streams.Singletone;

public class SingletoneLogic {
    public static SingletoneLogic singletoneLogic_instance=null;

    private SingletoneLogic()
    {
        System.out.println("Calling from Private constructor");
    }
    public static Synchronized SingletoneLogic getInstance()
    {
        if(singletoneLogic_instance==null)
        {
            singletoneLogic_instance =new SingletoneLogic();
        }
        return singletoneLogic_instance;
    }
}
