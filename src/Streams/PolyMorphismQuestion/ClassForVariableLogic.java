package Streams.PolyMorphismQuestion;
class A1
{
    int a=10;
    int b=20;
}
class B1 extends A1{
    int c=30;
    int b=40;

}
public class ClassForVariableLogic {
    public static void main(String[] args) {
        A1 a1 =new B1();
        System.out.println(a1.a);//10
        System.out.println(a1.b);//20
       // System.out.println(a1.c);//Get Comple time error
    }
}
