package Streams.MostAskedQuestionin2023to2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMainLogicClass {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
                           emp.add(new Employee("Kartik",30,1));
                           emp.add(new Employee("KarSingh",28,2));
                           emp.add(new Employee("KarGar",32,3));
                           emp.add(new Employee("KarGar",35,4));
        //Find the Second Highest Salary
        Employee secondHighestSalary=emp.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst().get();
        System.out.println(secondHighestSalary);

        //Find the name of Employee whose salary is greater then 30
        Map<Boolean, List<String>> map= emp.stream()
                .collect(Collectors.groupingBy(i->i.getSalary()>30,Collectors.mapping(i->i.getName()+" "+i.getSalary(),Collectors.toList())));
        System.out.println(map.get(true));
    }
}
