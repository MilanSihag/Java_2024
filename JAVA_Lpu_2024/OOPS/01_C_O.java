package OOPS;
class Add{
    public void sum(int n1,int n2){
        System.out.println("Sum of numbers is: " + (n1+n2));
    }
}
class C_O {
    public static void main(String[] args){
        System.out.println("Milan Sihag");

        Add obj1 = new Add(); //obj1 is reference variable
        obj1.sum(21,32);
    }
}
