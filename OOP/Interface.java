interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Laptop is coding");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop is coding");
    }
}

class Developer{
    public void develop(Computer com){
        com.code();
    }
}

public class Interface {

    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer mohith = new Developer();
        mohith.develop(lap);

        mohith.develop(desk);
        
    }
}
