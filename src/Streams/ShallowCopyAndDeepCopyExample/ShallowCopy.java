package Streams.ShallowCopyAndDeepCopyExample;

public class ShallowCopy {
    public static void main(String[] args) {
        Emp e=new Emp();
            e.id=1;
            Emp e2=e;
            e2.id=2;

        System.out.println("This value for e    "+e.id+"  "+"This Value for e2    "+e2.id);
        //e2.id replace 2 value for e.id also this this call shallow Copy
    }
}
