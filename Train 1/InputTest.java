import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputTest {

    /**
     * @param args
     */
    public static void main (String[]  args){
        //Method 1

        System.out.println("Method 1 input a number");
        InputStreamReader inr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inr);

        int num1;
        try {
            num1 = Integer.parseInt(br.readLine());
            
            System.out.println(num1);
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        

        
        //Method 2
        System.out.println("Method 2 input a number");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        
        sc.close();

    }
    
}
