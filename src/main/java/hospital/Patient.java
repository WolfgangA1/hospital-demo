package hospital;

public class Patient {


    private int healthLevel;
    private int bloodLevel;


    //overloaded constructor (constructors are very popular areas to overload)
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;

    }

    // default constructor for a patient object
    public Patient() {
        healthLevel = 10; // default patient health level
        bloodLevel = 20;// default patient blood level

    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void decreaseBloodLevel(int decreaseBloodAmount){
        bloodLevel -= decreaseBloodAmount;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

}
