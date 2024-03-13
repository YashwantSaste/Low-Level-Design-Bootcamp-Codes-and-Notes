public class ArrayBasics {
    public static void main(String[] args) {
        //declaration
        int arr[];
        int []brr;

        //allocation
        arr = new int[10];
        //initailization

        int marks[]={100,99,98,97,96};
        System.out.println(marks.length);
        //accessing the elements with the index
        System.out.println("First element: " + marks[0]);
        System.out.println("Second element: " + marks[1]);
        System.out.println("Third element: " + marks[2]);
        System.out.println("Fourth element: " + marks[3]);
        System.out.println("Last element: " + marks[4]);

        //outting the elements of array using loop
        for(int i=0; i <marks.length ;i++){
            System.out.println("Printing the "+ i + " th element: " + marks[i]);
        }

        //using the for-each loop for printing the elements of the array
        System.out.println("Printing the array with for-each loop");
        for(int number : marks){
            System.out.println(number);
        }
    }
}
