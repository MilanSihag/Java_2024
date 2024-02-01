package Arrays;

class array {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.print(arr[0][2]);
        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         if(col <= row){
        //         System.out.print(arr[row][col] + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int row = 0; row < arr.length; row++){
        //     int row_sum = 0;
        //     for(int col = 0; col < arr[row].length; col++){
        //         row_sum += arr[row][col];
        //     }
        //     System.out.println(row_sum);
        // }

        for(int row = 0; row < arr.length; row++){
            int row_min = arr[row][0];
            for(int col = 0; col < arr[row].length; col++){
                if(row_min > arr[row][col]) row_min = arr[row][col];
            }
            System.out.println(row_min);
        }
    }
}
