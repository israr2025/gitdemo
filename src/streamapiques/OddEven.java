package streamapiques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        //oddNumber
        List<Integer> number= Arrays.asList(1,2,3,4,5,6,7,8,9);
                  List<Integer> oddNumber =number.stream()
                          .filter(n-> n%2!=0)
                          .collect(Collectors.toList());

         System.out.println(oddNumber);


         // evenNumber
        List<Integer> evenNumber =number.stream()
                  .filter(x-> x%2==0).
                collect(Collectors.toList());
        System.out.println(evenNumber);
    }


}
