package assignment;
/*Init blocks execute in the order they appear.

    Static init blocks run once, when the class is first loaded.

    Instance init blocks run after the constructor's call to super().
*/


    class Init {
        Init(int x) { System.out.println("1-arg const"); }
        Init() { System.out.println("no-arg const"); }
        static { System.out.println("1st static init"); } // static init block
        { System.out.println("1st instance init"); } // instance init block
        { System.out.println("2nd instance init"); }
        static { System.out.println("2nd static init"); }

        public static void main(String [] args) {
          new Init();
          new Init(7);
        }
    }
//output:
    /*
     * 1st static init
       2nd static init
       1st instance init
       2nd instance init
       no-arg const
       1st instance init
       2nd instance init
       1-arg const
     */ 
