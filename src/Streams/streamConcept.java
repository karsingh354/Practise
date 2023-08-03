package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class streamConcept {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);
        int num=5;
        Map<Boolean, List<Integer>> m1 = list.stream().filter(i -> i != num).collect(Collectors.partitioningBy(i -> i> num));
        Integer lowest=m1.get(false).get(m1.get(false).size()-1);
        Integer heighest=m1.get(true).get(0);
        System.out.println(lowest+" "+heighest);

        List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> m2=list1.stream().reduce((a, b)->a+b);
        System.out.println(m2);


        String[] arr={"Kartik","Singh","KartikSingh","GauravSingh","GauravKartik"};
        Optional<String> max = Arrays.stream(arr).max(Comparator.comparing(String::length));
        System.out.println(max);

        String string="Springboot";
        LinkedHashMap<Character, Long> m5 = string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        Character key = m5.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);


        List<Integer> list3=Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,40);
        Set<Integer> m6 = list3.stream().filter(i -> Collections.frequency(list3, i) > 1).collect(Collectors.toSet());
        System.out.println(m6);

        List<Integer> list4=Arrays.asList(1,2,3,4,5,6,7,8,9,1,23,50,50);
        Map<Integer, Long> m06 = list4.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Integer key1 = m06.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getKey();
        System.out.println(key1);


        String str="I am developer";
        String[] cstr=str.split("");
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(collect);

        String string1="I am developer";
        List<String> list01=Arrays.asList(string1.split(" "));
        Collections.reverse(list01);
        System.out.println(list01);
    }
}
