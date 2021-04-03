import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Console {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        for (int i : s) {
            System.out.println(i);
            i = 5;
            System.out.println(i);

        }

        List<Integer> range = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        for (int d : range) {

            if (d % 2 == 0) {
                System.out.print("Test ");
            } else {
                System.out.print("Hello ");
            }
            System.out.println(d);
        }
    }
}