package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> ls = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(ls);

        /*The Stream.flatMap() function, as the name suggests, is the combination of a map and a flat operation. This means you first apply the map function and then flatten the result.
        To understand what flattening a stream consists in,
        consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ]
        which has "two levels". It's basically a big List containing three more List.
        Flattening this means transforming it in a "one level" structure e.g. [ 1,2,3,4,5,6,7,8,9 ] i.e. just one list.
         */
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> flat = Stream.of(evens,odds, primes).flatMap(
                list->list.stream()).collect(Collectors.toList());
        System.out.println(flat);

    }
}
