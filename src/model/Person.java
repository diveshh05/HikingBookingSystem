package model;

public abstract class Person {

    private String personID;
    private String name;
    private String phone;

    // constructors
    public Person(String personID, String name, String phone){
        this.personID = personID;
        setName(name);
        setPhone(phone);
    }

    // encapsulation
    public String getPersonID(){
        return personID;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }

    // encapsulation: setters
    public void setName(String name){
        if(name.trim().isEmpty()){
            System.out.println("Error: Name cannot be empty");
        }
        else{
            this.name = name.trim();
        }
    }

    public void setPhone(String phone){
        if(phone.length() != 8){
            System.out.println("Error: Phone number must be 8 digits");
            return;
        }
        for(int i = 0; i < phone.length(); i++){
            if(!Character.isDigit(phone.charAt(i))){  //
                System.out.println("Error; phone can only contain numbers");
                return;
            }
        }
        this.phone = phone;
    }

}
