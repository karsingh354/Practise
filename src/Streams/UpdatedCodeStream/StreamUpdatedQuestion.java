package Streams.UpdatedCodeStream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUpdatedQuestion {
    public static void main(String[] args) {

        //Find the first Non Repeated Character in given String
        String string1="My nam is";
        Map<Character,Long> character1=string1.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(i->i, LinkedHashMap::new, Collectors.counting()));
         Character firstNonRepeatedCharacter=character1.entrySet().stream().filter(i->i.getValue()==1).findFirst().get().getKey();
         System.out.println(firstNonRepeatedCharacter);
          
         //Find the Immediate lowest and highest value
        List<Integer> lst1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
                     int num=5;
        Map<Boolean,List<Integer>> sampleValue=lst1.stream().filter(i->i!=num).collect(Collectors.partitioningBy(i->i>num));
        Integer lowestValue=sampleValue.get(false).get(sampleValue.get(false).size()-1);
        Integer highestValue=sampleValue.get(true).get(0);
        System.out.println(lowestValue+" "+highestValue);

        //Find the frequency/or count how many Number are repeated
        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,8,9,98,7,8,0,10,10);
        Set<Integer> set=new HashSet<>();
        Set<Integer> countFrequency=list2.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
        System.out.println(countFrequency);

        //Find the String which contains 'k'
        List<String> list3=Arrays.asList("Kartik","Singh","KarGar");
        List<String> containsValue= list3.stream().filter(i->i.indexOf('k')!=-1).collect(Collectors.toList());
        System.out.println(containsValue);

        //Convert each character in UpperCase
        List<String> list4= Arrays.asList("Kartik","KarSingh","Gaurav");
        List<String> UpperCaseConvert=list4.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(UpperCaseConvert);

        //Find the maximum repeated value
        List<Integer> list5=Arrays.asList(1,2,3,5,6,98,6,7,9,9,98,98);
          Map<Integer,Long> sampleMap=list5.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
                Integer maxRepeatedValue=sampleMap.entrySet().stream()
                                              .max((o1,o2)->o1.getValue().compareTo(o2.getValue()))
                                              .get().getKey();
        System.out.println(maxRepeatedValue);

        //Reverse the String
        String string2="My name is";
        String[] cString=string2.split(" ");
        Collections.reverse(Arrays.asList(cString));
        System.out.println(Arrays.stream(cString).collect(Collectors.joining(" ")));

        String revsreAtSamePlace="My name is kartik";
        String[] resSamPlace=revsreAtSamePlace.split(" ");
        String resRevString=Arrays.stream(resSamPlace).map(i-> new StringBuffer(i).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(resRevString);  //out put:= yM eman si kitrak

        //Find the last three Number and Start Three Number
        List<Integer> list6=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> lastThreeNumber=list6.stream().skip(Math.max(1,list6.size()-3)).collect(Collectors.toList());
        List<Integer> startThreeNumber=list6.stream().limit(3).collect(Collectors.toList());
        System.out.println(lastThreeNumber+"  "+startThreeNumber);

        //Move all the Zero at Right song
        List<Integer> list7=Arrays.asList(1,0,7,8,0,9,0,9,0,9,7,70,7,8,8,0);
        List<Integer> shiftedValue=Stream.concat(list7.stream().filter(i->i!=0),list7.stream().filter(i->i==0)).collect(Collectors.toList());
        System.out.println(shiftedValue);

        //Find the count of Duplicate words in given String
        String string5="kartik";
        Map<Character,Long> countDuplicateValue=string5.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream()
                .filter(i->i.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(countDuplicateValue);

        //Find the Number starts with '2'
        List<Integer> list8=Arrays.asList(1,22,20,25,30,35);
        List<Integer> startsWith=list8.stream().map(i->String.valueOf(i)).filter(i->i.startsWith("2")).map(Integer::valueOf)
                                    .collect(Collectors.toList());
        System.out.println(startsWith);

        //Find the missing Element
        int [] arr={1,2,3,4,5,6,8,9,10};
        HashSet<Integer> sets=new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        System.out.println(sets);
        Integer missingElement=IntStream.rangeClosed(1,arr.length).filter(i->!sets.contains(i)).findFirst().getAsInt();
        System.out.println(missingElement);

        //Count the number of string which is stared by same Word
        List<String> list9=Arrays.asList("Kartik","KarSingh","Gaurav");
        Map<Character,Long> countString=list9.stream().collect(Collectors.groupingBy(i->i.charAt(0),Collectors.counting()));
        System.out.println(countString);

        //Find the Palindrome string in given List
        List<String> list10=Arrays.asList("level","beeb","kartik");
        List<String> palindromeString=list10.stream().filter(i->i.equals(new StringBuilder(i).reverse().toString())).collect(Collectors.toList());
        System.out.println(palindromeString);

        //Sort the String according to their length
        List<String> list11=Arrays.asList("Kartik","Gaurav","KarSingh");
        List<String> sortedList=list11.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println(sortedList);

        //Find the second highest Number in Given list
        int [] arst={5,9,11,2,8};
        Integer secondHighestValue= Arrays.stream(arst).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestValue);

        //Find the Anagram and group them
        List<String> list12=Arrays.asList("cat","act","tea","eat");
        Collection<List<String>>  groupAnagram= list12.stream().collect(Collectors.groupingBy(i->{
                             char[] chars=i.toCharArray();
                             Arrays.sort(chars);
                             return new String(chars);
                            })).values();
        System.out.println(groupAnagram);

        //Convert string into Toggle String
        String string10="Kartik".chars()
                .mapToObj(c->Character.isUpperCase(c)
                        ?Character.toUpperCase((char)c)
                        :Character.toUpperCase((char)c))
                .map(String::valueOf).collect(Collectors.joining());
        System.out.println(string10);

        //Find the Number of Repeated words in given String
        String strList="My name is is";
        String[] cStringValue=strList.split(" ");
        Map<String,Long> map01=Arrays.stream(cStringValue).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        List<String> countList=map01.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getValue()+"  "+i.getKey()).collect(Collectors.toList());
        System.out.println(countList);

        //In given List if we found number with is divisible by 3 the sqaure that number and other number print as it is
        int [] arrs={2,4,6,8,2,10,4,12,6};            // out put 2,4,36,8,2,10,4,144,36
        System.out.println(Arrays.stream(arrs).map(i->i%3==0?i*i:i).boxed().collect(Collectors.toList()));

        //Find the common even number in Lists
        List<Integer> lst1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> lst2=Arrays.asList(1,2,3,4,6)	;
        List<Integer> CommonList =Stream.concat(lst1.stream().filter(i->(i%2 == 0),lst2.stream().filter(i->(i%2)==0))).collect(Collectors.toList());
         System.out.println(commonList);

        
        //Input:"karik","pune","india","banglore","singh" Output:"singh","pune","india","banglore","kartik"
        List<String> lst=Arrays.asList("karik","pune","india","banglore","singh");
                   String temp=lst.get(0);
                   lst.set(0,lst.get(lst.size()-1));
                   lst.set(lst.size()-1,temp);
                   System.out.println(lst);


    }
}
