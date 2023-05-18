import java.util.Map;
import java.util.HashMap;

public class TestMap{
    public static void main(String[] args){
        Map<String, Integer> scores = new HashMap<>(); //A

        scores.put("Kathy", 42); //B
        scores.put("Bert", 343);
        scores.put("Skyler", 420); 


        System.out.println(scores);
        System.out.println(scores.get("Bert")); //C
    }
}













//A: HashMap needs TWO type parameters-- one for the key and one for the value
//B: use put() instead of add(), and now it takes two arguments(key, value)
//C: the get() method takes a key and returns the value(in this case, an integer)