package interviewQuestions;

import java.util.*;
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
        List<String> upperCaseRes = result.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Upper Case:"+upperCaseRes);
        List<Integer> number = Arrays.asList(1, 2, 3, 69,59);
        int ans4 = number.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println("Skipped number Tanu:"+ans4);

        OptionalDouble average = number.stream().mapToInt(Integer::intValue).average();
        System.out.println("Average:"+ average);
        List<String> str = Arrays.asList("banana", "orange", "apple", "grape");
        List<String> sortResult = str.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted List:"+sortResult);
        List<String> str1 = Arrays.asList("apple", "banana", "orange", "grape");
        String res2 = str1.stream().collect(Collectors.joining(",")).toString();
        System.out.println("string joining by comma:" +res2);
        List<String> str2 = Arrays.asList("apple", "bananaaa", "orangeeeeee", "grape");
        Optional<String> res3 = str2.stream().max((s1,s2) -> s1.length()-s2.length());
        System.out.println("max length:"+res3);
        List<Integer> num1 = Arrays.asList(4, 2, 8, 6, 10);
        Optional<Integer> ans = num1.stream().sorted((n1, n2)-> n2-n1).skip(1).findFirst();
        System.out.println("second largest:"+ans);
        List<Integer> duplicate = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
        List<Integer> result1 = duplicate.stream().distinct().collect(Collectors.toList());
        System.out.println("duplicate list:"+result1);
        List<String> s = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String minimumString = s.stream().min((e1, e2) -> e1.length() - e2.length()).orElse(null);
        System.out.println("minimum string:"+ minimumString);
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> ans1 = n.stream().map( k->k*k*k).collect(Collectors.toList());
        System.out.println("square :"+ans1);
        List<String> k = Arrays.asList("apple", "kiwi", "orange", "pear");
        String target = "banana";
        boolean ans3 = k.stream().anyMatch(e -> e.equals(target));
        System.out.println(ans3);









    }
}
