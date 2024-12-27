class Human{
    private String name;
    private int age;

    // Default constructer
    public Human(){
        name = "Mohith";
        age = 20;
    }

    // Parameterized Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Constructor {
    public static void main(String[] args) {
        // Creating an object using default constructor
        Human human1 = new Human();
        System.out.println("Name: " + human1.getName() + ", Age: " + human1.getAge());

        //Creating an Object for parameterized Constructor
        Human human2 = new Human("Anabathula", 15);
        System.out.println("Name: " + human2.getName() + ", Age: " + human2.getAge());
    }
    
}
