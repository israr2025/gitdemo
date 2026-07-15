package streamapiques;

import java.util.LinkedHashMap;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequncyOfElement {
    public static void main(String[] args) {
        String str="programing";
        LinkedHashMap<Character, Long> map=str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new , Collectors.counting()));
         System.out.println(map);

    }


}
