package model;

public class Trail {

    //field
    private String trailID;
    private String name;
    private int difficulty;
    private double distanceKm;
    private double pricePerPerson;

    // constructors
    public Trail(String trailID, String name, int difficulty, double distanceKm, double pricePerPerson){
        this.trailID = trailID;
        setName(name);
        setDifficulty(difficulty);
        setDistanceKm(distanceKm);
        setPricePerPerson(pricePerPerson);
    }

    public String getTrailID(){
        return trailID;
    }
    public String getName(){
        return name;
    }
    public int getDifficulty(){
        return difficulty;
    }
    public double getDistanceKm(){
        return distanceKm;
    }
    public double getPricePerPerson(){
        return pricePerPerson;
    }
    public void setName(String name){
        if(name.trim().isEmpty()){
            System.out.println("Error: Name cannot be Empty.");
        }
        else{
            this.name = name;
        }
    }
    public void setDifficulty(int difficulty){
        if(difficulty < 1 || difficulty > 3){
            System.out.println("Error: The difficulty level should be between 1 and 3");
        }
        else{
            this.difficulty = difficulty;
        }
    }
    public void setDistanceKm(double distanceKm){
        if(distanceKm <= 0){
            System.out.println("Error: Distance cannot be less or equal to 0");
        }
        else{
            this.distanceKm = distanceKm;
        }
    }
    public void setPricePerPerson(double pricePerPerson){
        if(pricePerPerson <= 0){
            System.out.println("Error: Price cannot be less or equal to 0");
        }
        else{
            this.pricePerPerson = pricePerPerson;
        }
    }

    @Override
    public String toString(){
        return "ID: " + trailID + " | Name: " + name + " | Difficulty level: " + difficulty + " | Distance: " + distanceKm + "km | Price per person: Rs" + pricePerPerson;
    }
}
