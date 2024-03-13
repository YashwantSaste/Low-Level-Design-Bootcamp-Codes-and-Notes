public class WrapperBasics {
    public static void main(String[] args) {
        int a= 8;
        double b=0.02;
        //first way to initiate the wrapper class
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);
        if(aObj instanceof Integer){
            System.out.println("The wrapper class of Integer is successfully intiated");
            System.out.println(aObj);
        }
        if(bObj instanceof Double){
            System.out.println("The wrapper class of Double is successfully intiated");
            System.out.println(bObj);
        }

        //another way for the initiation of the wrapper class
        Integer bClass = a;
        System.out.println("Printing the bClass " + bClass);

        //The above concept of feeding the  primitive data type to the wrapper class is called autoboxing

        //Now we will convert the wrapper class to the primitive data type

        Integer number =5;
        int num=number;
        System.out.println("the conversion of wrapper ro primitive data type is sucessful "+ num);
         
    }
}
