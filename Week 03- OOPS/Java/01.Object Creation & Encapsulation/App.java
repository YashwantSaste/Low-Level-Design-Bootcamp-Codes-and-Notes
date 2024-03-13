public class App {
    public static void main(String[] args) throws Exception {
        
        Student A = new Student();
        A.id=1;
        A.age=14;
        A.name="Shantanu";
        A.numberOfSubjects=6;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.numberOfSubjects);

        A.sleep();
        A.bunk();
        A.study();
         

        System.out.println("The above method is a messy, So we will try an optimized method below by using parameterized constructor");

        Student B= new Student(454,18,"Yashwant",8);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.numberOfSubjects);
        B.bunk();
        B.sleep();
        B.study();

        B.setAddress("Address set by setter function");
        B.getAddress();

        System.out.println("end of the b object");

        Student C= new Student(B);

        System.out.println("Printing the copy of the source object");
        System.out.println(C.age);
        System.out.println(C.name);
        System.out.println(C.id);
        C.sleep();
        C.bunk();
        C.study();
        
    }
} 
