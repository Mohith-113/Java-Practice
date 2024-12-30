class MohithException extends Exception{
    public MohithException(String message){
        super(message);
    }
}

public class OwnException {
    public static void main(String[] args) {
        int i = 20;

    try {
        if (i > 10) {
            throw new MohithException("Value is greater than 10");
        }
    }
    catch(MohithException e){
        System.out.println("System Exception" + e);

        System.out.println(e.getMessage());
    }
    }
}
