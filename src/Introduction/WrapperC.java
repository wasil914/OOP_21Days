package Introduction;

public class WrapperC {
    public static void main(String[] args) {
        int A = 10;
        //  A.  ? no options

        int s, t;
        s = 10;
        t = 20;

        Integer X = new Integer(45);
        System.out.println(X);
        System.out.println(X.toString()); //methods

        Integer Y = 90;

        swap(s, t);
        System.out.println(s + " " + t);
        //Swap not possible - Because in Java pass by reference is not followed , only pass by value .
        //Similarly if we relplace int by Integer - swap still won't work _Reason:"Integer is Final class".

        final A Wasil = new A("wasilkhan");
        Wasil.name="ModifiedName";
        //CANNOT REASSIGN:
       // Wasil = new A("shahid");


        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

    }

    static void swap(int s, int t) {
        int temp = s;
        s = t;
        t = temp;
    }
}


    class A{
       final int num = 14;
        String name;

        public A(String name){
            this.name=name;
    }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("Object Destroyed");
        }
    }
