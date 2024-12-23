public class ConditionalStatements{
    public static void main(String[] args) {
    
        int age = 7;

        if(age > 18){
            System.out.println("Welcome to the club!");
        }
        else if (age == 18){
            System.out.println("We are NOT doing that here!");
        }
        else{
            System.out.println("You are not allowed!");
        }

        if(age > 0 && age < 10){
            System.out.println("Your age is below 10");
        }
        else if (age > 11 && age < 18){
            System.out.println("Your age is below 18");
        }

        //Checking Even or Odd
        int num = 24345;

        String result = num % 2 == 0 ? "even" : "odd";

        System.out.println(result);


        //Switch Condition

        int day = 5;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Day");
                break;
        }
    
    }
}