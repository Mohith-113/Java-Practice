class Human{

    String name; 
    private int age;
    private double salary;
    long number;

    public void setAge(int age){
        this.age = age; //Method 1
    }

    public void setSalary(double salarySet){
        salary = salarySet; //Method 2
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

}

public class Encapuslation {

    public static void main(String[] args) {
        Human obj1 = new Human();
        // obj1.age = 12;  Its not possible
        obj1.setAge(20);
        obj1.setSalary(600000.0);
        obj1.name = "Mohith";
        obj1.number = 1478523690l;
    
        System.out.println("Name : " + obj1.name + ", \nAge : " + obj1.getAge());
    }

}
