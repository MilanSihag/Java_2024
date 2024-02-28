package JAVA_Lpu_2024;
class cal{
    int a;
    cal(int n){
        a = n;
    }
    public void area(){
        System.out.println("Area: "+(a*a));
    }
    public void perimeter(int b){
        System.out.println("Perimeter: "+(a*b));
    }
}
class inst{
    public static void main(String[] args){
        //instance of operator is used to check whether an object is an instance of a particular class
        String name = "Hello";
        var a = name instanceof String;
        System.out.println(a);

        //anonymus object
        new cal(5).area(); //it is used when we have to create an instance only once and don't want any reference to that instance
    }
}