public class funcPractice {
    public static void main(String[] args) {
        printNTimesName("Yashwant", 4);
        int ans=sumOfNumbers(5);
        System.out.println("The sum of 1 - N number is: " + ans);

    }
    public static void printNTimesName(String name,int noOfTimes){
        for(int count =0 ;count <noOfTimes;count ++){
            System.out.println("Printing the name " + count +"th time " +name);
        }
    }
    public static int sumOfNumbers(int number){
        int sum = 0;
        for(int i =1 ; i<=number; i++){
            sum += i;
        }
        return sum;
    }
    public static double avgOfTwoNum(int a, int b){
        double average = (double)(a + b)/2;
        return average;
    }
    public static void maxTwo(int a, int b){
        if(a>b){
            System.out.println("The maximum of two number is " +a);
        }
        else{
            System.out.println("The maximum of two number is " +b);
        }
    }
    public static void minTwo(int a, int b){
        if(a>b){
            System.out.println("The minimum of two number is " +a);
        }
        else{
            System.out.println("The minimum of two number is " +b);
        }
    }
    public static int getAbsolute(int number){
        if(number >= 0){
            return number;
        }
        else{
            return(0- number);
        }
    }
    public static int getExponent(int number, int power){
        int ans= 1;
        for(int i=0;i<number;i++){
            ans*=i;
        }
        return ans;
    }
    public static int randomNoGenerator(int number){
       return (int)Math.floor( Math.random()*(number + 1));
    }
}
