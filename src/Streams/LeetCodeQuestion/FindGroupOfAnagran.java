package Streams.LeetCodeQuestion;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FindGroupOfAnagran {
    public static void main(String[] args) {
        //Finf the Group Of Anagram
        List<String> lst= Arrays.asList("cat","tac","rat","atr","Hello");
        Collection<List<String>> groupedAnagram=lst.stream().collect(Collectors.groupingBy(i->{
                                 char[] chars=i.toCharArray();
                                 Arrays.sort(chars);
                                 return new String(chars);
                          })).values();
        System.out.println("Group of Anagrams are given"+groupedAnagram);
        //Find the only anagrams in List
        List<String> strAnagram= groupedAnagram.stream().filter(i->i.size()>1).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(strAnagram);

        //Throw words which is nont a  anagram
        lst.stream()
                .filter(word -> !strAnagram.contains(word))
                .forEach(word -> System.out.println(word + " is not an anagram"));
    }
}
