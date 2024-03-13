//find the multiplication of all values in an array

public class mulOfAllValuesOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int product=1;
        for(int number :arr){
            product = product * number;
        }
        System.out.println("Multiplication of all values in an array is: " + product);
    }
}
