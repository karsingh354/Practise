//How to Implement Functinal Interface Syntax
Types of Functional Interface
1>Predicate Syntax(methods in Predicate----            test()        test methods has boolean return Type)
=========================
class PredcateExample
{
public static void main(String[], args)
{
Predicate<Integer> square=x->x*x;
System.out.println(square.test(10));
}
}
=============================
2>Supplier Syntax
============
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greet = () -> "Hello from Supplier!";
        System.out.println(greet.get()); // Output: Hello from Supplier!

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // Random value
    }
}
==================================
3>Consumer(methods in consumer -----------------------------     accept()   accept method does not have any return type    )
============
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);
        printMessage.accept("Hello from Consumer!");
    }
}
==================
