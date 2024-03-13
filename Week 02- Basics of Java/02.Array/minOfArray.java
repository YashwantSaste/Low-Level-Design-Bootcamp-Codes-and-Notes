public class minOfArray {
    public static void main(String[] args) {
        int arr[]= {100,50,20,150,-5,250,-50,12,16};
        System.out.println(Integer.MIN_VALUE);
        int minValue=Integer.MAX_VALUE;
        for(int number: arr){
            if(number<minValue){
                minValue=number;
            }
            else{
                continue;
            }
        }
        System.out.println(minValue);
    }   
}
