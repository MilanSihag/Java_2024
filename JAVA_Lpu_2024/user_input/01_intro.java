package user_input;
import java.util.Scanner;

class intro {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String input = obj.nextLine();
        // System.out.println("name: "+input);
        String n1 = obj.nextLine();
        String n2 = obj.nextLine();
        int a = Integer.parseInt(n1,2);
        int b = Integer.parseInt(n2,2);
        System.out.println((int)(a^b));
    }
}
