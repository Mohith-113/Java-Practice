public class Exceptions {
    public static void main(String[] args) {
        int i = 6;
        int j  = 3;
        String str =null;

        int num[] = new int[5];

        try{
            int result = i/j;
            System.out.println(result);

            System.out.println(num[2]);
            System.out.println(num[3]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide with 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        catch(Exception e){
            System.out.println("An error occurred" + e);
        }
    }
}
