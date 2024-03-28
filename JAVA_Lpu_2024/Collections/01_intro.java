package Collections;
import java.util.ArrayList;
class intro {
    public static void main(String[] args){
        ArrayList<String> stringArray = new ArrayList<>();
        ArrayList<Integer> intArray = new ArrayList<>(); //we used wrapper class because primitive data types are nor allowed in array list.
        
        stringArray.add("Milan");
        stringArray.add("Garvit");
        stringArray.add("Gaurav");
        stringArray.add("aman");

        System.out.println(stringArray);
    }    
}
//collections framework- provides a set of interfaces and classes
//it includes other interfaces like collection interface,map,iterator
//collection interface is the root interface of collection framework