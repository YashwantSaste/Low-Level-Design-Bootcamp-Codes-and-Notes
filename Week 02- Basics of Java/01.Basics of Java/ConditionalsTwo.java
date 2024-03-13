import java.util.Scanner;

public class ConditionalsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Do you know driving?");
        boolean knowDriving = sc.nextBoolean();


        if(age >=18){
            if(knowDriving == true){
                System.out.println("You are eligible for the driving license");
            }
            else{
                System.out.println("Learn driving first and then apply for the license");
            }
        }
        else{
            System.out.println("You are not eligible for the driving license");
        }

        sc.close();
    }
}
