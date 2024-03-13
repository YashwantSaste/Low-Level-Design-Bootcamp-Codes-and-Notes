import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int arr[];
        int size;
        Scanner ip= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=ip.nextInt();
        arr=new int[size];
        //taking array as an input
        for(int count=1; count<=size; count++){
            int index= count -1;
            System.out.println("Enter the element for index " + index);
            arr[index]= ip.nextInt();
        }

        //printing the array

        for(int number: arr){
            System.out.println(number);
        }

        ip.close();
    }
}
