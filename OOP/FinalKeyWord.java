//final - variable, method, class


//In method no one can override if method is final

final class Calc{
    public void show(){
        System.out.println("Inside Calc Show");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// Error: We cannot extends that Calc class no one can use the features of that class
// class Calc2 extends Calc{
//     public void show(){
//         System.out.println("Inside Calc2 Show");
//     }
// }

public class FinalKeyWord {

    public static void main(String[] args) {
        final int num = 876; //Final Variable
        //num = 098;
        // Error: cannot assign a value to final variable num

        Calc obj = new Calc();
        obj.show();
        obj.add(num, 87);
    }
    
}
