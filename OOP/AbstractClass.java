abstract class Demo{
    public abstract void show();

    public void display(){
        System.out.println("This is a Display method from Demo Class");
    }
}

class UseDemo extends Demo {
    public void show(){

        System.out.println("Displaying show in the UseDemo Class");

    }
}


public class AbstractClass {
    public static void main(String[] args) {
        UseDemo obj = new UseDemo();
        obj.show();
    }
}
