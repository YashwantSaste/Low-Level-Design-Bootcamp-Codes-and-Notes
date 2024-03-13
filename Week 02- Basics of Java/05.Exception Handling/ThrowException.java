public class ThrowException {
    public static void printName(String Name) throws ArithmeticException, NullPointerException {
        if(Name.equalsIgnoreCase("Yashwant")){
            throw new NullPointerException();
        }
        System.out.println("The name is "+ Name);
    } 
    public static void main(String[] args) {
        try{
            printName("Yashwant");
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
        finally{
            System.out.println("THis is executed anyways ");
        }
    }
}
