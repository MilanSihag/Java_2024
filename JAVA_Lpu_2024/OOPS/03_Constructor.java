package OOPS;
class Person{
    
    public String name;
    public int age;
    public Character sex;

    public Person(){
        System.out.println("in default constructor");
    }
    public Person(String name,int age){
        System.out.println("in para constructor type 1");
        this.age = age;
        this.name = name;
    }
    public Person(String name,int age, Character sex){
        System.out.println("in para constructor type 2");
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    //copy constructor
    public Person(Person obj){
        System.out.println("in copy constructor");
        this.age = obj.age;
        this.name = obj.name;
        this.sex = obj.sex;
    }
}
class Car{
    private String color,model;
    private int year;
    private boolean rentalStatus;

    public Car(){}
    public Car(String color,String model,int year){
        this.color = color;
        this.model = model;
        this.year = year;
        this.rentalStatus = false;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public boolean isRentalStatus() {
        return rentalStatus;
    }
}
class Constructor {
    public static void main(String[] args){

        Car c1 = new Car("red","Audi",2022);
        System.out.println(c1.getColor() + " " + c1.getModel() + " " + c1.getYear() + " " + c1.isRentalStatus());
    }
}
// Person p1 = new Person("Milan", 21);
        // Person p2 = new Person();
        // Person p3 = new Person("Garvit",17,'M');
        // Person p4 = new Person(p3);
        // System.out.println(p1.name);
        // System.out.println(p3.sex);
        // System.out.println(p4.age);
