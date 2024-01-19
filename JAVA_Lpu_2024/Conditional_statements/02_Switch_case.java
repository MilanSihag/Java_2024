package Conditional_statements;

class Switch_case {
    public static void main(String[] args){
        // int n = 3;
        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Not a week day number");
        //         break;
        // }

        String day = "Tuesday";
        // If we don't want to use break then we use '->' insted of ':'
        // Also if we want to take output from switch case then we use following format

        String output = "";
        output = switch (day) {
            case "Monday","Tuesday","Saturday","Sunday" -> "No class";
        
            case "Thursday", "Friday" -> "Class from 7-9";
            
            default -> "class from 8-9";
        }; // plz look for this ';'
        System.out.println(output);
    }
}
