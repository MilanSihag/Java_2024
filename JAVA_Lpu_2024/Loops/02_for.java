package Loops;

class For {
    public static void main(String[] args){
        for(int i = 0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }    
}