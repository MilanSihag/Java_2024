package user_input;
import java.util.Scanner;

class intro {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input = obj.nextLine();
        System.out.println("name: "+input);
    }
}
