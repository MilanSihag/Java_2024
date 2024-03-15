package OOPS;
@FunctionalInterface
interface A{
    int add(int n1,int n2);
}
class lambdaExpression {
    public static void main(String[] args){
        // A obj = new A(){
        //     public int add(int n1,int n2){
        //         return n1+n2;
        //     }
        // };
        A obj = (num1,num2) -> num1 + num2;
        obj.add(12, 30);
    }    
}
