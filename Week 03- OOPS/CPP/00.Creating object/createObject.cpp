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

    //default constructor

    Student(){
        cout<<"Default constructor of the Student class"<<endl;
    }

    //parameterized constructor

    Student(int id, int age , string name, int numberOfSubjects){
        this->id=id;
        this->name=name;
        this->numberOfSubjects=numberOfSubjects;
        this->age=age;
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
};


int main () {
    Student A;
    A.age=19;
    A.id=982382;
    A.name="Yashwant";
    A.bunk();

    Student B;
    B.age=21;
    B.id=9823342;
    B.name="Shailesh";
    B.study();

    Student A(454646,21,"Yashwant",8);
    cout<<A.age<<endl;
    cout<<A.id<<endl;
    cout<<A.name<<endl;
    cout<<A.numberOfSubjects<<endl;
    A.sleep(); 

    Student B(12145,18,"Manoj",8);
    cout<<B.age<<endl;
    cout<<B.id<<endl;
    cout<<B.name<<endl;
    cout<<B.numberOfSubjects<<endl;
    B.bunk();

    Student C =A;

    //Another way of copying the classes are
    //Student C(A);
    cout<<"This is A Student Name: "<<A.name<<endl;
    cout<<"This is C Student Name: "<<C.name<<endl; 

    //Dyanamic object creation

    Student *F= new Student(1242,18,"Yashwant",7); 
    //Acccessing the attributes and the methods of the dynamic class
    cout<<F->age<<endl;
    cout<<F->name<<endl;
    cout<<F->numberOfSubjects<<endl;
    cout<<F->id<<endl;
    F->sleep();
    delete F;
    return 0;
}