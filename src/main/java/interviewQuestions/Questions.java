package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 7, 6, 9, 10);
       // int res = numbers.stream().max(Integer::compare).get();
        // int res = numbers.stream().mapToInt(n->n).max().getAsInt();
        int res = numbers.stream().mapToInt(n-> n).max().orElseThrow();
        System.out.println("Max Element:" + res);
        //find out the even numbers
        List<Integer> evenNum = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers:" + evenNum);
        List<String> strings = Arrays.asList("apple", "yellow", "banana", "orange", "grape");
        char searchChar = 'a';
        List<String> result = strings.stream().filter( e->e.contains(String.valueOf(searchChar))).collect(Collectors.toList());
        System.out.println("Containing a character:"+result);
    }
}
