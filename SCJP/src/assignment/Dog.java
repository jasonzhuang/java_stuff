package assignment;

//1.Instance variables and objects live on the heap
//2.Local variables live on the stack
//3.main() is placed on the stack
//4.method is on statck
//5. java only has value-pass(pass-by-copy-of the-variable)
public class Dog {

    String name;
    //boolean selected = 0; compile error

    byte a = 3;
    byte b = 4;
    //byte c = a + b; //compile error
    public static void main(String[] args) {
        Dog d;
        d = new Dog();
        d.go();
    }

    void go(){
        System.out.println(",,,,,");
    }
}
