import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //creating object of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        System.out.println("My age is "+ age);


        //to free the resource we have to close the object

        input.close();
    } 
}
