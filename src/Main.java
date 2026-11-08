import model.Guide;
import model.Hiker;

public class Main {

    public static void main(String[] args){

        Guide g1 = new Guide("G001", "Sam", "547896",  -5, 0, 0);
        System.out.println(g1.getPersonID() + " " + g1.getName() + " " + g1.getPhone() + " " + g1.getExperienceYears() + " " + g1.getMaxDifficulty() + " " + g1.getDailyRate());
    }
}
