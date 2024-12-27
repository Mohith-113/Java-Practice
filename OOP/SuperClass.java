class A{
    public A(){
        System.out.println("In the 'A' Constructor Default");
    }

    public A(int n){
        System.out.println("In the 'A' Constructor Parameterized");
    }

    public A(int n, int k){
        System.out.println("In  the 'A' Constructor parameterized and Super Class");
    }
}

class B extends A{
    public B(){
        System.out.println("In the 'B' Constructor Default");
    }

    public B(int n){
        System.out.println("In the 'B' Constructor Parameterized");
    }

    public B(int n, int k){
        super(n,k);
        System.out.println("In  the 'B' Constructor parameterized and Super Class");
    }
}


public class SuperClass {
    
    public static void main(String[] args) {
        System.out.println("Now Creating object of B");

        B obj = new B();

        System.out.println("\n\n\n");

        System.out.println("Now calling B object with Parametors");

        B obj1 = new B(5);

        System.out.println("\n\n\n");

        System.out.println("Now calling B object with Parametors and Super Class");

        B obj2 = new B(5, 8);


    }
}
