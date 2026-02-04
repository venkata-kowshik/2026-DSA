import java.util.*;

class StreamsEXample {
    public static void main(String[] args) {

        List<Integer> li = List.of(1, 2, 4, 6, 7, 12, 45, 33, 2, 3, 42, 32, 13);

        // Predicate<Integer> pre = t-> {
        //         return t % 2 == 0;   // check even
        // };

        li.stream().filter( t-> t % 2 == 0).sorted().map(t-> t*t ).forEach(System.out::println);
         //li.stream().filter( t-> t % 2 != 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
/* 
import java.util.*;
import java.util.function.Predicate;

class StreamsExample {
    public static void main(String[] args) {

        List<Integer> li = List.of(1, 2, 4, 6, 7, 12, 45, 33, 2, 3, 42, 32, 13);

        Predicate<Integer> pre = (Integer t) -> {
            return t % 2 == 0;   // check even
        };

        long ans = li.stream().filter(pre).count();

        System.out.println(ans);
    }
}
*/