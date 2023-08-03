package Streams.Singletone;

public class SingletoneMainClass {
    public static void main(String[] args) {
        SingletoneLogic X= SingletoneLogic.getInstance();
        SingletoneLogic Y=SingletoneLogic.getInstance();
        System.out.println(X.hashCode()+"  "+Y.hashCode());
    }
}
