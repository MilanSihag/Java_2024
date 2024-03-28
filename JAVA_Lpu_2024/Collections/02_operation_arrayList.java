package Collections;
// import java.util.ArrayList;
// class operation_arrayList {
//     public static void main(String[] args){
//         ArrayList<String> arr1 = new ArrayList<>();
//         arr1.add("Bikaner");
//         arr1.add("Churu");
//         arr1.add("Jaipur");
//         arr1.add("Jodhpur");

//         System.out.println("Element at 2 is: "+arr1.get(2));

//         arr1.set(3,"Ajmer");
//         System.out.println(arr1);

//         arr1.remove(2);
//         System.out.println("After removal: "+arr1);

        
//     }    
// }

import java.util.ArrayList;
class Student{
    
    ArrayList<String> data = new ArrayList<>();
    
    void addStudent(String name){
        data.add(name);    
    }
    
    void removeStudent(String name){
        data.remove(name);
    }
    
    void displayAll(){
        System.out.println(data);
    }
}
class Demo{
    public static void main(String[] args){
        Student s1 = new Student();
        
        s1.addStudent("Milan");
        s1.displayAll();
        s1.addStudent("Aman");
        s1.displayAll();
        s1.addStudent("Gaurav");
        s1.displayAll();
        
        s1.removeStudent("Aman");
        s1.displayAll();
    }
}
