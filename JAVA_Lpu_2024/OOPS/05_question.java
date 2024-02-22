
class Vehicle{
    public String identificationNumber;
    public double maxSpeed;
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public String getIdentificationNumber(){
        return identificationNumber;
    }
    public void setIdentificationNumber(String id){
        identificationNumber = id;
    }
}
class Car extends Vehicle{
    int numOfPassangers;
    public Car(int numOfPassangers,String identificationNumber,double maxSpeed){
        this.identificationNumber = identificationNumber;
        this.numOfPassangers = numOfPassangers;
        this.maxSpeed = maxSpeed;
    }
    
    public int getNumOfPassangers() {
        return numOfPassangers;
    }
    public void setNumOfPassangers(int numOfPassangers) {
        this.numOfPassangers = numOfPassangers;
    }
    
    public void displayDetails(){
        System.out.println("vehicle id: "+identificationNumber+" maxSpeed: "+maxSpeed+" num of passangers: "+numOfPassangers);
    }
}
class Trucks extends Vehicle{
    int maxWeight;

    public Trucks(int maxWeight,String identificationNumber,double maxSpeed) {
        this.maxWeight = maxWeight;
        this.identificationNumber = identificationNumber;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void displayDetails(){
        System.out.println("vehicle id: "+identificationNumber+" maxSpeed: "+maxSpeed+" maxWeight: "+maxWeight);
    }
}
class Bicycles extends Vehicle{
    public Bicycles(String identificationNumber,double maxSpeed){
        this.identificationNumber = identificationNumber;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails(){
        System.out.println("vehicle id: "+identificationNumber+" maxSpeed: "+maxSpeed);
    }
}
class question {
    public static void main(String[] args){
        Car v2 = new Car(4, "22", 300);
        Trucks v3 = new Trucks(5000, "33", 50);
        Bicycles v4 = new Bicycles("44", 25);
        v2.displayDetails();
        v3.displayDetails();
        v4.displayDetails();
    }
}
// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.