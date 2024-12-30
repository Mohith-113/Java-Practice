interface A{

    int num  = 20; //The variables in the Interface are final

    void show();
    void display();
}

interface X{
    void xShow();
}

interface Y{
    void yShow();
}

class B implements A,Y{
    public void show(){
        System.out.println("B.show() From A interface");
    }
    public void display(){
        System.out.println("B.display() From A interface");
    }
    public void xShow(){
        System.out.println("B.xShow() from interface X by extending Y");
    }
    public void yShow(){
        System.out.println("B.yShow() from interface Y");
    }
}

public class MoreAboutInterface {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.display();
        b.xShow();
        b.yShow();
    }
}

