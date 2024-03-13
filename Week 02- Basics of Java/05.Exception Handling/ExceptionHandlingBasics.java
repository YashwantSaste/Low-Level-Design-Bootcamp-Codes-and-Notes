
public class ExceptionHandlingBasics {
    public static void main(String[] args) {
        //the below line gives an arithmatic exception
        // int a =5 / 0;

        //this will gice ArrayOutOfBoundIndex exception
        // int arr[]= new int[5];
        // System.out.println(arr[8]);
        System.out.println("Before");
        try{
            int a=5/0;
        }
        catch(ArithmeticException err){
            System.out.println(err.getMessage());
            System.out.println("We will have to handle exception here");
        }
        finally{
            System.out.println("This line will be executed anyways");
        }
        System.out.println("After");
    }
}
