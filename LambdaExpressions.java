import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        List<String> first = new ArrayList<>();
        topNames2015.stream()
                .forEach(c ->
                        first.add(c.substring(0, 1).toUpperCase() + c.substring(1)));

        first.stream().sorted().forEach(System.out::println);
        Area a = (x, y) -> x * y;
        System.out.println(a.area(3, 4));
        Area b = (x, y) -> x / y;
        System.out.println(b.area(12, 4));
        Runnable runnable = () -> {
            String s = "Hello word";
            String[] ch = s.split(" ");
            Arrays.stream(ch).forEach(c -> System.out.print(c + ""));
        };
        runnable.run();
    }
}

interface Area {
    //function interface
    double area(int x, int y);
}