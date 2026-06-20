public class Person {
    
    // Atribut

    int id;
    String name;

    // Konstruktor

    Person(String n){
        name = n;
    }

    Person(int i, String n){
        id = i;
        name = n;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }
}
