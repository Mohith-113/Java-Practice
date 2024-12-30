public class Throw {
    public static void main(String[] args) {
        int i = 20;

        try{
            int j = 19/20;
            if(j == 0){
                throw new ArithmeticException("Answer will not zero");
            }

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception rises" + e);
        }
    }
}
