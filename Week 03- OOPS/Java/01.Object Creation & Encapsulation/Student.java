public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int numberOfSubjects;

    //private attributes
    private String address;

    //default constructor

    public Student(){
        System.out.println("This is the default constructor of the student class");
    }

    //parameterized constructor

    public Student(int id, int age, String name, int numberOfSubjects){
        System.out.println("This is the default constructor of the student class");
        //setting the content of the class
        this.id=id;
        this.name=name;
        this.age=age;
        this.numberOfSubjects=numberOfSubjects;
        
    }

    //copy constructor

    public Student(Student srcStudent){ //srcStudent -> the object to be get copied
        System.out.println("This is the default constructor of the student class");
        //setting the content of the class
        this.id=srcStudent.id;
        this.name=srcStudent.name;
        this.age=srcStudent.age;
        this.numberOfSubjects=srcStudent.numberOfSubjects;
    }

    //Methods /Attributes / Behaviours
    
    public void study(){
        System.out.println(name + " is studying");
    }

    public void bunk(){
        System.out.println(name + " is bunking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    private void privateFunction(){
        System.out.println("This is a private function");
        System.out.println(address);
    }

    public void setAddress(String address){

        //we can extra layer of authentication here
        this.address=address;
    }

    public String getAddress(){
        System.out.println("Printing the address");
        return this.address;
    }
}
