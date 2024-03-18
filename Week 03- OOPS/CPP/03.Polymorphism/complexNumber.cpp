#include<iostream>
using namespace std;
class ComplexNos{
    public:
    int real;
    int imag;

    ComplexNos(){
        real=imag= -1;
    }

    ComplexNos(int r, int i):real(r), imag(i){};

    void printComplexNos(){
        printf("[%d + i%d]\n",this->real,this->imag);
    }
    //operator overloading
    ComplexNos operator + (const ComplexNos &B){
        //this-> 'A' Instance
        ComplexNos temp;
        temp.real = this->real + B.real;
        temp.imag = this->imag + B.imag;
        temp.printComplexNos();
        return temp;  
    }
    ComplexNos operator - (const ComplexNos &B){
        //this-> 'A' Instance
        ComplexNos temp;
        temp.real = this->real - B.real;
        temp.imag = this->imag - B.imag;
        temp.printComplexNos();
        return temp;  
    }
    bool operator == (const ComplexNos &B){
        //this-> 'A' Instance
        if(this->real == B.real && this->imag==B.imag){
            return true;
        }
        else{
            return false;
        }
        
    }
};
int main(){
    ComplexNos A(4,5);
    A.printComplexNos();
    ComplexNos B(6,10);
    B.printComplexNos();
    ComplexNos C = A + B;
    ComplexNos D = A - B;
    int isEqual = A == B;
    cout<<isEqual<<endl;
    return 0;
}