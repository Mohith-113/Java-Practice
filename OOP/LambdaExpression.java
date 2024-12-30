@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface forReturn{
    int add(int i, int j);
}

public class LambdaExpression {

    public static void main(String[] args) {
        A obj = () -> System.out.println("In the show() of interface A");
        
        obj.show();

        forReturn obj1 = (i,j) -> i+j;

        int result = obj1.add(4,5);

        System.out.println(result);
    }
    
}
