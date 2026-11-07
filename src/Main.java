import model.Hiker;

public class Main {

    public static void main(String[] args){
        Hiker h1 = new Hiker("H001", "Kevin", "51234567",25,2);
        System.out.println(h1.getName() + " | " + h1.getPhone() + " | age " + h1.getAge() + " | level " + h1.getFitnessLevel());


        Hiker h2 = new Hiker("H002", "     ", "abc", 5, 7);

        h1.setPhone("59955");
        h1.setPhone("54848151");
        System.out.println("New phone: " + h1.getPhone());
    }
}
