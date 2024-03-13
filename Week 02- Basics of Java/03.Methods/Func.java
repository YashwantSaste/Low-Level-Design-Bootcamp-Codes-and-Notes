public class Func {
    public static void main(String[] args) {
        System.out.println("Hello there, I am in PVSM function");
        returnMyName();
        returnMyName("Yashwant");
        int ans=getSum(12, 12);
        System.out.println("the sum is "+ ans );
    }
    //function with no parameters
    public static void returnMyName(){
        System.out.println("This is the returnMyName Function");
        System.out.println("this line is before the return statement");
        return;
        //whatever code is written after the return statement is not executable
        //For example
        // System.out.println("This is my line after return statement");
    }

    //same function but now with parameter
    public static void returnMyName(String name){
        System.out.println("This is the name of the paramterized returnMyName function" + name);
    }
    public static int getSum(int a, int b){
        return a + b;
    }
}
