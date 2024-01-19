package Conditional_statements;


class conditional{
    public static void main(String[] args){
        int age = 25;
        if(age>=18 && age<=60){
            System.out.println("Person can dive");
        }
        else{
            System.out.println("Person cannot dive");
        }

        int a = 5;
        int b = 10;
        if(a>b){
            System.out.println("A is grater than B");
        }
        else if(a==b){
            System.out.println("A is equal to B");
        }
        else{
            System.out.println("B is greater than A");
        }

        String output = a%2 == 0 ? "Even" : "Odd" ;
        System.out.println(output);
    }
}
