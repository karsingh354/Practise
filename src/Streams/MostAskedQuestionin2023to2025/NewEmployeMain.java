package Streams.MostAskedQuestionin2023to2025;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewEmployeMain {
    public static void main(String[] args) {


        List<NewEmplyee> empnew= new ArrayList<>();
        empnew.add(new NewEmplyee("Kartik",29,"IT"));
        empnew.add(new NewEmplyee("KarSingh",28,"IT"));
        empnew.add(new NewEmplyee("Gaurav",30,"NON-IT"));
        empnew.add(new NewEmplyee("KarGar",31,"IT"));
        empnew.add(new NewEmplyee("KarGarSingh",35,"NON-IT"));

        //Find the Second Highest salary
         NewEmplyee emps=empnew.stream().sorted(Comparator.comparing(NewEmplyee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println(emps);

        //Find the max salary in each Department
        Map<String,NewEmplyee> result=empnew.stream().collect(Collectors.groupingBy(NewEmplyee::getDept,Collectors.collectingAndThen(Collectors.toList(),
                             empSt->empSt.stream().max(Comparator.comparing(NewEmplyee::getSalary)).get()
                             )));
        System.out.println(result);

    }
}
