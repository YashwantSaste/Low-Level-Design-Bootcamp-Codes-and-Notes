public class funcPracticeArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println("printing the array");
        printArray(arr);
        System.out.println("Printing the sum of array elements");
        int sum = sumOfAllValuesOfArray(arr);
        System.out.println(sum);
        doubleArrayElement(arr);
    }
    //printing array function
    public static void printArray(int arr[]){
        for(int element: arr){
            System.out.println(element);
        }
    }
    //printing the sum of the array
    public static int sumOfAllValuesOfArray(int arr[]) {
        int sum =0;
        for(int element: arr){
            sum+=element;
        }
        return sum;
    }
    //doubling each array element
    public static void doubleArrayElement(int arr[]){
        System.out.println("Befor doubling the elements of the array");
        int len = arr.length;
        for(int i=0;i<len;i++){
            arr[i] *=2;
        }
        System.out.println("After doubling the elements of the array");
        printArray(arr);
    }
}
