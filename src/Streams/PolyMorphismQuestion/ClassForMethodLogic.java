package Streams.PolyMorphismQuestion;
class A
{
    void m1()
    {
        System.out.println("Calling from A m1 method");
    }
    void m2()
    {
        System.out.println("Calling from A m2 method");
    }
    void m3()
    {
        System.out.println("Calling from A m3 method");
    }
}
class B extends A{
    void m1()
    {
        System.out.println("Calling from B m1 method");
    }
}
public class ClassForMethodLogic {
    public static void main(String[] args) {
        A a=new B();
        a.m1();
        a.m2();
        a.m3();
    }
}
