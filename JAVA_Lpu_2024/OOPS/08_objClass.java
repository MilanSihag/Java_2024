package OOPS;
class Student{
    int rollNO;
    String subject;
    public boolean equals(Student other){
        if(this.subject.equals(other.subject) && this.rollNO==other.rollNO) return true;
        else return false;
    }
}
class objClass {
    public static void main(String[] args){
        Student obj1 = new Student();
        obj1.rollNO = 1;
        obj1.subject = "maths";
        obj1.rollNO = 2;
        obj1.subject = "science";
        Student obj2 = new Student();
        System.out.println(obj1); //it will by default calls toString method
        System.out.println(obj2.toString()); //this toString() method can be overridden in class
        System.out.println(obj1.equals(obj2)); //this equals method is comparing hashcodes of classes
    }
    
}