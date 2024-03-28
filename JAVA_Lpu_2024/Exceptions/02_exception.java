package Exceptions;

class exception {
    public static void main(String[] args){
        try{
            int a = 2/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{//this block will always executed regardless of exception handled or not
            //there can be only one finally block for try catch block
            System.out.println("From finally");
        }
        System.out.println("At the end");
    }
}
