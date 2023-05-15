import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other){
        return this.age - other.age;
    }

    public String toString(){
        return name + " (" + age + " years old)";
    }
}

public class Main{
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        Collections.sort(people);

        for (Person person : people){
            System.out.println(person);
        }
    }
}