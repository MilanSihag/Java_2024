package wrapper;

class intro {
    public static void main(String[] args){
        int a = 5;
        Integer A = a; //auto boxing
        Integer q = Integer.valueOf(a); //boxing

        Integer obj = new Integer(5);
        int primitive = obj; //auto unboxing
        int pri = obj.intValue();//unboxing
        
    }    
}
//wrapper classes provides a mechanism to convert primitive data types to objects and objects to primitive.