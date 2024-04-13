import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamJava {


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        a.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));
        int sum = a.stream().filter(x -> x % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("Sum : " + sum);
        List<Integer> b = a.stream().filter(x -> x > 3).toList();
        b.forEach(x -> System.out.print(x + " "));
        System.out.println();
        int max = a.stream().max(Integer::compare).get();
        int min = a.stream().min(Integer::compare).get();
        System.out.println("Max:" + max + " \n" + "Min: " + min);

    }

}
