package Concept3;

//class Test{
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }

// class Test {
//     static String name;
//
//     public Test(String name) {
//         this.name = name;
//     }
// }
public class InnerClasses {

    static class Test {
      String name;

     public Test(String name) {
         this.name = name;
     }
 }


    public static void main(String[] args) {
        Test a = new Test("Wasil");
        Test b = new Test("khn");
        System.out.println(a.name);
        System.out.println(b.name);
    }
    }


//static class A{
//
//}