package varargs;
class Test{
    public int add(int ... n){ //these '...' will make the method to take variable number of arguments in form of array
        int sum = 0;
        for(int i : n){
            sum+=i;
        }
        return sum;
    }
}
class intro {
    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.add(2, 5,3,4,5,6,6,7,7,7,4));
    }
}
