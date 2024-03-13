#include<iostream>
#include<string>
using namespace std;

//The vehicle class is the parent class
class Vehicle {
private:
    string name;
public:
    string model;
    int noOfTyres;

public:

    Vehicle(string name, string model, int noOfTyres) {
        cout << "I am inside Vehicle constructor" << endl;
        this->model = model;
        this->name = name;
        this->noOfTyres = noOfTyres;
    }

    string getName() {
        return this->name; // Return name as a string
    }

    void startEngine() {
        cout << "Engine is starting for " << getName() << endl;
    }

    void stopEngine() {
        cout << "Engine is stopping for " << getName() << endl;
    }

    ~Vehicle(){
        cout<<"This is the destructor of the Vehicle"<<endl;
    }
};


//The Car is the derived class which will inherit from the Base/ Parent classs i.e Vehicle in this case

class Car : public Vehicle {
public:
    int noOfDoors;
    string transmissionType;

    Car(string name, int noOfTyres, string model, int noOfDoors, string transmissionType) : Vehicle(name, model, noOfTyres) {
        cout << "This is the car constructor" << endl;
        this->noOfDoors = noOfDoors;
        this->transmissionType = transmissionType;
    }

    void startAC() {
        cout << "AC has been started of " << getName() << endl;
    }
    ~Car(){
        cout<<"This is the destructor of the Car"<<endl;
    }

};

class Motorcycle : public Vehicle {
protected:
    string handleBarStyle;
    string SuspensionType;

public:
    Motorcycle(string name, string model, int noOfTyres, string handleBarStyle, string suspensionType) : Vehicle(name, model, noOfTyres) {
        cout << "This is the motorcycle constructor" << endl;
        this->handleBarStyle = handleBarStyle;
        this->SuspensionType = suspensionType;
    }
    void wheelie(){
        cout<<"The bike is weheeling"<<endl;
    }
    ~Motorcycle(){
        cout<<"This is the destructor of the Motorcycle"<<endl;
    }
};

int main() {
    Car A("Maruti 800", 4, "LXI", 4, "manual");
    A.startEngine();
    A.stopEngine();
    A.startAC();

    Motorcycle M("BMW", "VXI", 4, "UBar", "Hard");
    M.startEngine();
    M.stopEngine();
    M.wheelie();
    return 0;
}
