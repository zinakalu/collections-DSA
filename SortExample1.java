import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample1{
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);

        Collections.sort(numbers);
        System.out.println(numbers); //Output: [1,2,5,7]
    }
}