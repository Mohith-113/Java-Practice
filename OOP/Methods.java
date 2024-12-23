class Computer{

    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String openBook(){
        return "Book Opened...";
    }
    
    public String getPen(int cost){

        return cost>=5 ? "Pen" : "More Money...";

    }
}


public class Methods {

    public static void main(String[] args) {

        Computer com = new Computer();
        com.playMusic();
        String book = com.openBook();
        System.out.println(book);

        String pen = com.getPen(2);
        System.out.println(pen);
    }
}