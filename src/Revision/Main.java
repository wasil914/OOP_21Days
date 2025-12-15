package Revision;

public class Main {
    public static void main(String[] args){
       States JK = new States(1,"Jammu & Kahmir","Kashmiri , Urdu , Dogri",3.14f,92) ;
        System.out.println(JK.stateId);
        System.out.println(JK.stateName);
        System.out.println(JK.stateLanguage);
        System.out.println(JK.sexRatio);
        System.out.println(JK.literacyRate);
    }
}
