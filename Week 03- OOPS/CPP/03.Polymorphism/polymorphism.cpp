#include<iostream>
using namespace std;
class Add{
    public:
    //x,y two integer addition
    int sum(int x, int y){
        cout<<"This is an integer sum funciton with two arguments"<<endl;
        return x+y;
    }
    //x,y,z three integer addition
    int sum(int x,int y, int z){
        cout<<"This is an integer sum funciton with three arguments"<<endl;
        return x+y+z;
    }
    //double addtion
    double sum(double x, double y){
        cout<<"This is an double sum funciton with two arguments"<<endl;
        return x + y;
    }
};
int main(){
    Add a;
    int sum1=a.sum(1,2);
    cout<<sum1<<endl;
    int sum2=a.sum(1,2,3);
    cout<<sum2<<endl;
    double sum3=a.sum(1.24,1.26); 
    cout<<sum3<<endl;
    return 0;
}