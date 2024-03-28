package Exceptions;
//we handle runtime errors
//exception is a object
class intro {
    public static void main(String[] args){
        try{
            int i = 1/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello world");
    }
}
