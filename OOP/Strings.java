class Mobile{
    String brand;
    String model;
    static String name;
    static String network;

    public void show(){
        System.out.println("Brand: "+brand );
        System.out.println("Model: "+model );
        System.out.println("Network: "+network );
        System.out.println("name: "+ name);
    }
}


public class Strings {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.brand = "OPPO";
        obj1.model = "A5 2020";
        obj1.network = "4G";
        Mobile.name = "OPPO A5 2020"; 

        obj2.brand = "Realmi";
        obj2.model = "C3";
        obj2.network = "3G";
        Mobile.name = "Realmi C3";

        //static variables can call using class name

        obj1.network = "5G";

        obj1.show();
        obj2.show();
        
        System.out.println(obj1.name == obj2.name);
        System.out.println(obj1.network == obj2.network);
        
    }
}
