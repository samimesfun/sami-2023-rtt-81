package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Alice", 30);

        // Accessing attributes through getter methods
        System.out.println(person.getName()); // Output: Alice
        System.out.println(person.getAge());  // Output: 30

        // Modifying attributes through setter methods
        person.setName("Bob");
        person.setAge(35);

        System.out.println(person.getName()); // Output: Bob
        System.out.println(person.getAge());  // Output: 35
    }
}




