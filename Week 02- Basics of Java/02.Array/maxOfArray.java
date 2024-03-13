public class maxOfArray {
    public static void main(String[] args) {
        int arr[]={100,50,20,150,-5,250,-50,12,16};
        int maxValue= Integer.MIN_VALUE;
        for(int number: arr){
            if(number> maxValue){
                maxValue=number;
            }
            else{
                continue;
            }
        }
        System.out.println(maxValue);
    }
}
