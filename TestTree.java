import java.util.*;

public class TestTree{
    public static void main(String[] args){
        new TestTree().go();
    }

    public void go(){
        Book b1 = new Book ("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable<Book>{
    private String title;
    public Book(String t){
        title = t;
    }

    public int compareTo(Book other){
        return this.title.compareTo(other.title);
    }

    public String toString(){
        return title;
    }
}

//The 'Book' class implements 'Comparable<Book>', meaning that 'Book' instances can be compared
//to each other. Therefore, the element type 'Book' implemented the Comparable interface

//The 'compareTo' method uses the 'compareTo' method of the 'String' class to compare the titles 
//of the books. Since titles are 'String' objects, and the 'String' class in Java has its own 'compareTo'
//method for comparing strings, we used this method to compare the titles of the books

//'this.title' refers to the title of the current 'Book' object, and 'other.title' refers to the title of
//the 'Book' object that's being compared with the current object. The 'compareTo' method of the 'String' class
//is called on 'this.title', with 'other.title' as the argument.


//OR

//we can use a custom Comparator that knows how to sort the elements in the set.

class BookCompare implements Comparator<Book>{
    public int compare(Book one, Book two){
        return one.title.compareTo(two.title);
    }
}
//NB because the 'title' field in the 'Book' class is private, it can't be accessed directly from the
//'BookCompare' class. Instead, we should use a getter method(like 'getTitle()') to access the 'title'
//field. e.g.

class Book{
    private String title;
    public Book (String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
}

class BookCompare implements Comparator<Book>{
    public int compare(Book one, Book two){
        return one.getTitle().compareTo(two.getTitle());
    }
}


//OR we can use a lambda expression instead

Set<Book> bookSet = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
