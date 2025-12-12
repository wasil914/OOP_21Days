public class Objprint {
    public static void main(String[] args){

        School dps = new School(21,"Ninth",'A');
        System.out.println(dps); //obj .tostring method since is not present in class it goes with default and prints hex...
    }
}
class School{
    int classnum;
    String std;
    char section;

    School(int a , String b,char c){

        int classnum=a;
        String std=b;
        char section=c;
    }


}
