
package net.codejava.cweek1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class L21C3 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> result = numbers.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(result);
    }
}
