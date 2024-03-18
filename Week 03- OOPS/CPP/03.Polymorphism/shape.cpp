#include<iostream>
using namespace std;

class Shape{
    public:
    virtual void draw(){
        cout<<"Generic drawing..."<<endl;
    }
};

class Circle : public Shape{
    public:
    void draw() override {
        cout<<"Circle is drawing..."<<endl;
    }
    
}; 

class Rectangle  : public Shape{
    public:
    void draw() override{
        cout<<"Rectangle is drawing..."<<endl;
    }
    
}; 
class Triangle : public Shape{
    public:
    void draw() override{
        cout<<"Triangle is drawing..."<<endl;
    }
    
}; 

void shapeDrawing(Shape *s){
    s->draw(); //this draw is polymorphic
}
int main(){
    Circle C;
    C.draw();
    Rectangle R;
    Triangle T;
    shapeDrawing(&T);
    shapeDrawing(&R);
    return 0;
}