package Strings;

class intro {
    public static void main(String[] args){
        char[] characters = {'h','e','l','l','o'}; //string in java are immutable
        String c = new String(characters);//string are nothing but array of characters
        String obj = new String("Hello");//obj is storing reference of memory where "Hello" is strored in Heap memory
        System.out.println(obj + "World");
        String s1 = "hello"; //whenever we create string in java, jvm checks "string constant pool" first,if the string already exist,
        // a reference to the pooled instance is returned, if string doesn't exist a new string instance is generated in pool
        String s2 = "World"; //Here s1 and s3 are not created as seperate objects. This makes java memory efficient
        String s3 = "hello"; //string constant pool maintains all strings so s1 and s3 will point to same memory location

    }    
}
