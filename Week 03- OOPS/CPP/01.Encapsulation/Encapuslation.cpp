#include<iostream>
#include<string>
using namespace std;

//creating a class

class Student {
    public:

    //Attributes
    int id;
    int age;
    string name;
    int numberOfSubjects;

    private:
    int *gpa;
    string address;

    public:
    //default constructor

    Student(){
        cout<<"Default constructor of the Student class"<<endl;
    }

    //parameterized constructor

    Student(int id, int age , string name, int numberOfSubjects, string address, float gpa){
        this->id=id;
        this->name=name;
        this->numberOfSubjects=numberOfSubjects;
        this->age=age;
        this->address=address;
        this->gpa = new int(gpa);
        cout<<"This is the parameterized constructor of the Student class"<<endl;
    }

    //copy constructor 

    Student(const Student &sourceObject){ //sourceObject signifies A in this example taken in the main function
        this->id=sourceObject.id; 
        this->name=sourceObject.name;
        this->numberOfSubjects=sourceObject.numberOfSubjects;
        this->age=sourceObject.age;
        cout<<"This is the parameterized constructor of the Student class"<<endl;
    }

    //destructor

    ~Student(){
        cout<<"This is the default destructor of the class"<<endl;
    }

    //behaviour/methods/functions
    //this keyword is used to signify the particular object
    void study(){
        cout<<this->name<<" is Studying"<<endl;
    }
    void sleep(){
        cout<<this->name<<" is Sleeping"<<endl;
    }
    void bunk(){
        cout<<this->name<<" is Bunking"<<endl;
    }

    //private methods
    private:  
    void getAddresss () {
        cout<<"This is the address of the given student"<<endl;
    }

    //getter and setter for the private attribute members
    public:
    void setGpa(float a){
        //we can set a layer of authentication here to make the changes
        *this->gpa= a;
    }

    float getGpa(){
        cout<<"The GPA of the student is "<<endl;
        return *this->gpa;
        
    }
};


int main () {
    
    //Dyanamic object creation

    Student *F= new Student(1242,18,"Yashwant",7,"Nanded",7.56); 
    //Acccessing the attributes and the methods of the dynamic class
    cout<<F->age<<endl;
    cout<<F->name<<endl;
    cout<<F->numberOfSubjects<<endl;
    cout<<F->id<<endl;
    //cout<<F->address<<endl;
    //cout<<F->gpa<<endl;
    //we also can't access the address and gpa like this as they are private, so we use the getter and setter functions to access it 
    F->sleep();
    //F.getAddress()-->this method won't be avaliable as this is private method of the class student
    //setting the gpa via getter
    F->setGpa(8.51);
    //getting the private members via the getter function
    cout<<F->getGpa()<<endl;
    delete F;
    return 0;
}