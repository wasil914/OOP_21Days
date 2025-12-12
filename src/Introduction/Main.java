package Introduction;

public class Main{

    public static void main(String[] args){

        /*Humans h1 = new Humans();

        h1.age=23;
        h1.name="Waz";
        h1.b_type='A';*/

        /*System.out.println(h1.age);
        System.out.println(h1.name);
        System.out.println(h1.b_type);*/


        /*Humans h2 = new Humans();
        System.out.println(h2.age);
        System.out.println(h2.name);
        System.out.println(h2.b_type);*/

        /*Humans h3 = new Humans(43,"Osama",'A');
        System.out.println(h3.age);
        System.out.println(h3.name);
        System.out.println(h3.b_type);*/

        /*Humans h4 = new Humans(12,"Aslam",'C');

        System.out.println(h4.age);
        System.out.println(h4.name);
        System.out.println(h4.b_type);

        h4.greeting();
        h4.namechanger("Wowsil");

        System.out.println(h4.name);*/

        /*Humans h5 = new Humans();
        System.out.println(h5.age);
        System.out.println(h5.name);
        System.out.println(h5.b_type);*/

        /*Humans h6 = new Humans(15,"jhon",'K');
        Humans h7 = new Humans(h6);
        System.out.println(h7.name);*/

    }
}



class Humans{
    int age;
    String name;
    char b_type ;

    Humans(int yearsold,String namez , char bt) {
        this.age = yearsold;
        this.name = namez;
        this.b_type = bt;
    }
       /* age=26;
        name="Fraz";
        b_type='B';
    } */

    /*void greeting(){
        System.out.println("Hi " + this.name);
    }*/

    /*void namechanger(String newName){
        this.name = newName;
    }*/

    /*Humans(){
        this (17,"Dylan",'F');*/

    Humans  (Humans other) {
        this.name = other.name;
        this.age = other.age;
        this.b_type = other.b_type;
    }
}