import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample3{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        Collections.sort(names, Comparator.reverseOrder());

        System.out.println(names); //Output: [Charlie, Bob, Alice]
    }
}