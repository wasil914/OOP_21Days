package StaticX;

public class animals {
    int age;
    String name;
    int li ;
    boolean hum;
    static long population;         //long population;

    public animals(int age, String name, int li, boolean hum) {
        this.age = age;
        this.name = name;
        this.li = li;
        this.hum = hum;

        animals.population+=1;
    }
}
