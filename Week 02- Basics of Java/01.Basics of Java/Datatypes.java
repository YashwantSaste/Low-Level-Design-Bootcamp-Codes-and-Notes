public class Datatypes {
    public static void main(String[] args) {
        boolean found=true;
       // boolean found =1, this will not run as Java do not store boolean as 0 or 1 ;
       char ch ='k';
       System.out.println("My character is " + ch);
       System.out.println(found);
       System.out.println("The next character to print " + (char)(ch+1));

       //integral datatypes
        // byte stores data from -128 to 127
       byte marks = 100;
       System.out.println("My marks are " + marks);

       short weight = 30000;
       System.out.println("My Wweight is " + weight);

       int height = 100000;
       System.out.println("My height is " + height);

       //whenever you use long in Java use L at the end of the value

       long length = 1000L;
       System.out.println("My length is " +length);

       //whenever you use float in Java use f at the end of the value

       float decimal = 3.1455f;
       System.out.println("My decimal number is " +decimal);

       double percentage = 99.546141616f;
       System.out.println("My length is " +percentage);


       //implicit data type conversion
       byte num1 = 12;
       short num2= num1;
       System.out.println(num2);
       int num3 = num2;
       System.out.println(num3);
       long num4 = num3;
       System.out.println(num4);

        //explicit type conversion

        int num = 107;
        char myCh = (char)num;
        System.out.println(myCh);


        //this gives -12 as ans, why??
        //
        int myNum = 500;
        byte mynum2= (byte)myNum;
        System.out.println(mynum2);

    }
}
