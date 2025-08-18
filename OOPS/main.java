class Main{
    public static void main(String[] args) {
        Person p1 = new Person(); // using default constructor here
        p1.name = "Ansh";
        p1.age = 18;
        p1.talk();
        System.out.println(p1.name + " is " + p1.age + " years old.");



        Person p2 = new Person(25, "Alice"); // using parameterized constructor
        System.out.println(p2.name + " is " + p2.age + " years old.");
        System.out.println("Total persons created: " + Person.count);
    }
}

class Person{
    int age;
    String name;

    static int count;

    Person() {
        count++;
    }

    Person (int age, String name) {
        this.age = age;
        this.name = name;
        count++;
    }

    void talk(){
        System.out.println(name + " is talking.");
    }
}