class Calc{
    public int add(int n1,int n2 ){
        return n1 + n2;
    }
}


public class Add{
    public static void main(String[] args) {

        Calc c = new Calc();
        int result = c.add(4, 2);

        System.out.println(result);

    }    
}