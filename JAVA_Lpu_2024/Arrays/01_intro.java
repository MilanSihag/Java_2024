package Arrays;

class intro {
    public static void main(String[] args){
        // int arr[] = {1,2,34,6};
        // int arr[] = new int[4];
        // arr[0] = 12;
        // System.out.println(arr[2]);
        // System.out.println("Array length " + arr.length);

        // for(int i: arr){
        //     //for each method for accessing elements of array
        //     System.out.println(i);
        // }

        // int roll_no[] = {1,2,3,4,5,6,7,8,9,10};
        // for(int i: roll_no){
        //     if(i%2!=0) continue;
        //     System.out.println(i);
        // }

        float arr[] = {1.2f,3.4f,23.5f,5.7f,32.8f};
        float sum = 0f;
        for(float i : arr){
            sum+=i;
        }
        System.out.println("Sum of array: " + sum);
    }    
}
