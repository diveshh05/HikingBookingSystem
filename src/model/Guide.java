package model;

public class Guide extends Person {

    private int experienceYears;
    private int maxDifficulty;
    private double dailyRate;

    //constructors
    public Guide(String personID, String name, String phone, int experienceYears, int maxDifficulty, double dailyRate){
        super(personID, name, phone);

        setExperienceYears(experienceYears);
        setMaxDifficulty(maxDifficulty);
        setDailyRate(dailyRate);
    }
     // encapsulation
    public int getExperienceYears(){
        return experienceYears;
    }
    public int getMaxDifficulty(){
        return maxDifficulty;
    }
    public double getDailyRate(){
        return dailyRate;
    }

    public void setExperienceYears(int experienceYears){
        if(experienceYears < 0){
            System.out.println("Error: experience years cannot be negative");
        }
        else {
            this.experienceYears = experienceYears;
        }
    }
    public void setMaxDifficulty(int maxDifficulty){
        if( maxDifficulty < 1 || maxDifficulty > 3){
            System.out.println("Error: Difficulty level must be between 1 and 3");
        }
        else{
            this.maxDifficulty = maxDifficulty;
        }
    }
    public void setDailyRate(double dailyRate){
        if(dailyRate <= 0){
            System.out.println("Error: Daily rate must be more than 0");
        }
        else{
            this.dailyRate = dailyRate;
        }
    }
    @Override
    public String toString(){
        return super.toString() + " | Experience: " + experienceYears + " | Max Difficulty: " + maxDifficulty + " | Daily Rate: Rs " + dailyRate;
    }
}
