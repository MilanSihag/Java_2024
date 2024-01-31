package Arrays;

class array {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.print(arr[0][2]);
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(row == 0 || row == arr.length-1){
                System.out.print(arr[row][col] + " ");
                }
                else if(col == 0 || col == arr[row].length-1){
                    System.out.print(arr[row][col] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
