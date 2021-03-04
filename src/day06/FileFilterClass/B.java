package day06.FileFilterClass;

/**
 * @author JIAJUN KOU
 */

   class B extends A{

        {
            System.out.print("4");
        }
        static {
            System.out.print("5");
        }

        public B() {
            System.out.print("6");
        }
    }

    class Hello {
        public static void main(String[] args) {
            B a = new B();
        }
    }

