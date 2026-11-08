import model.Guide;
import model.Hiker;
import model.Trail;

public class Main {

    public static void main(String[] args){

        Hiker h1 = new Hiker("H001", "Tom", "54756", 11, 6);

        Guide g1 = new Guide("G001", "Sam", "59645",  0, 9, 0);

        Trail t1 = new Trail("T001", "Benny", 5, 0, 0);

        System.out.println();
        System.out.println(h1);
        System.out.println();
        System.out.println(g1);
        System.out.println();
        System.out.println(t1);
    }
}
