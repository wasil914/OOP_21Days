package SingletonConcept;

public class singletonc {
   // private int num=0;
   private singletonc(){

    }

    private static singletonc instance;

   public static singletonc getinstance(){
       if(instance == null){
           instance= new singletonc();
       }
       return instance;

   }
}
