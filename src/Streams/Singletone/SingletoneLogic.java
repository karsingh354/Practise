package Streams.Singletone;

public class SingletoneLogic {
    public static SingletoneLogic singletoneLogic_instance=null;

    private SingletoneLogic()
    {

    }
    public static SingletoneLogic getInstance()
    {
        if(singletoneLogic_instance==null)
        {
            singletoneLogic_instance =new SingletoneLogic();
        }
        return singletoneLogic_instance;
    }
}
