package model;

public class Hiker extends Person {

    // field
    private int age;
    private int fitnessLevel;

    //constructors
    public Hiker(String personID, String name, String phone, int age, int fitnessLevel){
        super(personID, name, phone); // the field that is private in person so Hiker can’t touch them directly
        setAge(age);
        setFitnessLevel(fitnessLevel);
    }

    //encapsulation
    public int getAge(){
        return age;
    }
    public int getFitnessLevel(){
        return fitnessLevel;
    }

    public void setAge(int age){
        if(age < 12 || age > 75){
            System.out.println("Error: Age must be between 12 to 75.");
        }
        else{
            this.age = age;
        }
    }
    public void setFitnessLevel(int fitnessLevel){
        if(fitnessLevel < 1 || fitnessLevel > 3){
            System.out.println("Error: Fitness level must be between 1 and 3.");
        }
        else{
            this.fitnessLevel = fitnessLevel;
        }
    }

}
