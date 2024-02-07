package OOPS;
//Encapsulaation is a process of wrapping data members and member functions together in a single unit
class Account{
    private String acc_name = "Milan"; //instance variable created in heap
    private int acc_no = 12223432; //instance variable
    private float balance = 254.05f; //instance variable

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
    public void setBalance(float balance) {
        this.balance = balance; //local varaible created in stack
    }
    public int getAcc_no() {
        return acc_no;
    }
    public float getBalance() {
        return balance;
    }
    public void setAcc_name(String name){
        acc_name = name;
    }
    public String getAcc_name(){
        return acc_name;
    }
}

class Encapsulation {
    public static void main(String[] args){
        Account obj  = new Account();
        System.out.println("Old account name: " + obj.getAcc_name());

        obj.setAcc_name("Garvit");
        System.out.println("New Account name: " + obj.getAcc_name());
    }    
}

