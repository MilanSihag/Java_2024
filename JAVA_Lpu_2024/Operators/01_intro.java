package Operators;

class Operators{
    public static void main(String[] args) {
        //-----Arithmatic operators-----
        int num1 = 12;
        int num2 = 56;
        System.out.println("Add " + (num1+num2));
        System.out.println("Subtract "+ (num1-num2));
        System.out.println("Multiply" + (num1*num2));
        System.out.println("Divide" + (num1/num2));
        System.out.println("Modulus" + (num1%num2));
        //num1++ is post increment
        //++num2 is pre increment
        int output1 = num1++;
        int output2 = ++num2;
        System.out.println("output1 ->"+output1+" output2 ->"+output2);
        
        /*-----Comparison operators-----
            used to compare two variables/values
            they will return boolean values("true" or "false")
            == != > < >= <=
        */

        /*-----Logical operators---
            used to compare two conditions
            && || !
        */
    }
}
