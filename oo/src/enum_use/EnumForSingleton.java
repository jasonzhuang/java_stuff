package enum_use;

public enum EnumForSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("using enum to implements singleton");
    }
    public static void main(String[] args) {
        INSTANCE.doSomething();
    }
}
