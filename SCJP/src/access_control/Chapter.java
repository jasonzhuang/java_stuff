package access_control;

public class Chapter {

    private int a_aa$;
    //can't contain particular character
//    private String dd#dd;//wrong

    //telling the JVM to skip (ignore) this variable when you attempt to serialize the object containing it
    private transient int num;

    // enum are not String or int.Each of the enumerated Size types are actually instance of Size 
    enum Size {BIG, MEDIUM, SMALL}

    //synchronized(also native) modifier can be applied only to methods, not variables, not classes, just methods.
    public synchronized void retrieveUserInfo(int id) { }

    //var-arg must be last, doStuff(int ...x, char c) is illegal.
    void doStuff2(char c, int... x)  { }//expects first a char, then 0 to many ints

    static enum AA{A, B};
}

// enum really is a special kind of class, so you can add constructor, instance variables, methods
// An enum declared outside a class must NOT be marked static, final, abstract, protected, or private(only public)
// inside a class can be marked static, public, protected, or private
enum BagSize {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), MEDIUM(10), SMALL(16){
       public String getCode() {
           return "A";
       }
    };

    //constructor
    BagSize(int weight) {
        this.weight = weight;
    }

    private int weight;

    public int getWeight() {
        return this.weight;
    }

    //the method is override by constant SMALL
    public String getCode() {
        return "B";
    }
}