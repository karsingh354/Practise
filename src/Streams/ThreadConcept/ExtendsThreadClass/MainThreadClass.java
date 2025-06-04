package Streams.ThreadConcept.ExtendsThreadClass;

public class MainThreadClass {
    public static void main(String[] args) {
        MyThread th= new MyThread();
                 th.start();
    }
}
