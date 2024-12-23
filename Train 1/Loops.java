public class Loops{
    public static void main(String[] args) {
    
        int i = 0;

        while(i<10){
            System.out.print(i+1 +"    ");
            i++;
        }

 

        do{
            System.out.print(i+1 +"    ");
            i++;
        }while(i<20);


        for(int j = 21; j < 31; j++){
            System.out.print(j+"    ");
        }
        
        System.out.println("\n");

        
        for(int k = 1; k < 4; k++){
            System.out.println("Day " + k);

            for(int l = 1; l < 10; l++){
                System.out.print(l + "    ");
            }
            
            System.out.println("\n");
        }
    }
}