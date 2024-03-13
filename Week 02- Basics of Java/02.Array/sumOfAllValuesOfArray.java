//find sum of all values in an array
public class sumOfAllValuesOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum=0;
        for(int number:arr){
            sum=sum + number;
        }
        System.out.println(sum);
    }
}
