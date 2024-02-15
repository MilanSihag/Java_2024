package Strings;

class stringBuffer {
    public static void main(String[] args){
        //string buffer/string builder
        StringBuffer obj1 = new StringBuffer("python");
        System.out.println(obj1.capacity());
        obj1.append(" is hard");
        System.out.println(obj1.capacity());
        System.out.println(obj1);
        System.out.println(obj1.length());
        obj1.insert(6, " very ");
        System.out.println(obj1);
        obj1.replace(6, 11, " not very"); //here 11 index is exclusive
        System.out.println(obj1);
        System.out.println(obj1.reverse());
    }
}
