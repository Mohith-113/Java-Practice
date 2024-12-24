
class Arr{
    public void getArray(){
        int array[][] = new int[5][5];


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                array[i][j] = (int)(Math.random() * 10);
            }
        }

        //Display the array 

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }


        System.out.println("\n\n\nPrinting Array using another method:\n");

        //Array Display Method 2

        for(int n[] : array){
            System.out.println("+-----------------------------+");
            System.out.print("|  ");
            for(int m : n){
                System.out.print(""+ m + "  |  ");
            }
            System.out.println();
            System.out.println("+-----------------------------+");
        }
    }

    public void jaggedArray(){
        int jaggedArray[][] = new int[5][];
        for(int i = 0; i < 5; i++){
            jaggedArray[i] = new int[i+1];
            for(int j = 0; j < i+1; j++){
                jaggedArray[i][j] = (int)(Math.random() * 10);
            }
        }
        //Display the array



    }

}


public class Arrays{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 ,6 ,7 ,8 ,9, 0, 3, 4, 5};

        for(int i = 0; i < 13; i++){
            System.out.print(arr[i] + "    ");
        }

        System.out.println("\n");

        int arr1[] = new int[4];
        arr1[0] = 5;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 65;

        for(int i = 0; i < 4; i++){
            System.out.print(arr1[i] + "    ");
        }


        System.out.println("\n\n\n");


        Arr obj = new Arr();

        obj.getArray();
        
    }
}