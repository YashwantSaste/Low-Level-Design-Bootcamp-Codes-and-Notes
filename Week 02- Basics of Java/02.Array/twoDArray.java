public class twoDArray {
    public static void main(String[] args) {
        //declaration / definition
        int arr[][]=new int[4][4];
        //intialization
        int arr2[][]={
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        //printing the array
        for(int temp[] : arr2){
            for(int number:temp){
                System.out.println(number);
            }
        }

        //taking out the row and col size
        int rowSize  = arr2.length;
        int colSize = arr2[0].length;
        System.out.println("Row size is : "+rowSize + " & col size is :"+ colSize);

        //printing the arry with traditional for loop
        System.out.println("printing the array with traditional for loop");
        for(int row=0;row<rowSize;row++){
            for(int col =0; col<colSize; col++){
                System.out.println(arr2[row][col] + " " );
            }
        }
    }
}
