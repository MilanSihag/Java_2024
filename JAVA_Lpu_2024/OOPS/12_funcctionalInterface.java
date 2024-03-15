package OOPS;
@FunctionalInterface
interface A{
    void print(int num,int num2);
}
class funcctionalInterface {
    public static void main(String[] args){
        //for void type without parameter
        // A obj = () -> (System.out.println("Lambda function"););
        
        //with parameter
        // A obj1 = (int num) -> System.out.println("from main print "+num);
        // A obj1 = (num) -> System.out.println("from main print "+num);
        // A obj1 = num -> System.out.println("from main print "+num);

        //with multiple parameter
        //we have to write in '()'
        A obj1 = (num1,num2) -> System.out.println("From main printing "+num1+" "+num2);
        obj1.print(5,10);
    }    
}
