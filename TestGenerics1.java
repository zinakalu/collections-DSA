abstract class Animal{
    void eat(){
        System.out.println("animal eating");
    }
}

class Dog extends Animal{
    void bark();
}

class Cat extends Animal{
    void meow();
}





public class TestGenerics1{
    public static void main(String[] args){

        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals); //pass a List<Animal> into our testAnimals method
    }

    public static void takeAnimals(List<Animal> animals){
        for (Animal a : animals){
            a.eat();
        }
    }
}