import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income :");
        income=sc.nextInt();
        //if statement
        if(income > 100000 ){
            System.out.println("You are a well jober ");
        }
        
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible for voting");
        }

        else{
            System.out.println("You are not eligible for voting");
        }

        //ternary operator
        System.out.println("Enter any random number");
        int number = sc.nextInt();
        System.out.println((number>=10) ? "Number greater than or equal to 10" : "Number is smaller than 10");

        sc.close();
    }
}
