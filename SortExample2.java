import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        names.sort(Comparator.naturalOrder());

        System.out.println(names); //Output [Alice, Bob, Charlie]
    }
}