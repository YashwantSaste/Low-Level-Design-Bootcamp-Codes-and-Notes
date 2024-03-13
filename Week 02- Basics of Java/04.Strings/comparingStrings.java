/*
 * " == " is used for comparing the two strings
 * it uses the reference to do so, means if two strings are pointing towards a same reference then they are equal, if not they aren't
 * but this is not useful for the comparison of strings made with string literal and with new keyword as they have different refercne locations
 */

public class comparingStrings {
    public static void main(String[] args) {
        String str="Name";
        String str2= "Name";
        if(str == str2){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("The both strings are not the same");
        }
        //now we will do it for the new keyword string literal
        System.out.println("Printing the result for the heap memory string");
        String str3= new String("Name");
        if(str == str3){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("The both strings are not the same");
        }
    }
}
