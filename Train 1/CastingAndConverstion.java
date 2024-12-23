public class CastingAndConverstion {
    public static void main(String[] args) {
        // Explicit Casting
        int i = 10;
        double d = (double) i; // Explicit casting from int to double
        System.out.println("i = " + d);

        //implicite Casting
        int a = 258;
        byte b = (byte) a;
        System.out.println("b = " + b);  //Output b=2 where 258%256 = 2

        float fnum = 52.36f;
        int inum = (int) fnum;
        System.out.println("inum = " + inum); //Output inum = 52


        //Type Promotion
        byte x = 10;
        byte y = 20;
        int result = x * y;
        System.out.println("result = " + result); //Output result = 200i
    }
}
