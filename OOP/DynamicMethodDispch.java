class Computer{
    public void show(){
        System.out.println("This is a Computer");
    }
}

class Laptop extends Computer{
    public void show(){
        System.out.println("This is a Laptop");
    }
}

class Pc extends Computer{
    public void show(){
        System.out.println("This is a Pc");
    }
}


public class DynamicMethodDispch {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.show();

        obj = new Laptop();
        obj.show();

        obj = new Pc();
        obj.show();
    }
}
