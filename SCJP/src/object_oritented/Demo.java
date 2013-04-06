package object_oritented;

//1.the modifier of subclass can't be more restrictive than the overridden method's
//2.The overriding method CAN throw any unchecked (runtime) exception, regardless of whether the overridden method declares the exception
//3.The overriding method must NOT throw checked exceptions that are new or broader than those declared by the overridden method.
//4.cannot override a method marked static
//5.which overridden version of the method to call is decided at runtime based on object type,
//but which overloaded version of the method to call is based on the reference type of the argument passed at compile time
//6.static can't override, but can redefine
public class Demo {

     public void doStuff(Animal a) {
         System.out.println("In the Animal version");
      }
      public void doStuff(Tiger h) {
         System.out.println("In the Horse version");
      }

      public static void main(String[] args) {
          Demo demo = new Demo();
          Animal animal = new Tiger();
          demo.doStuff(animal); //In the Animal version
      }
}
