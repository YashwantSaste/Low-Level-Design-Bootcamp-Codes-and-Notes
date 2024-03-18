#include<iostream>
using namespace std;

class Shape{
    public:
    void draw(){
        cout<<"Generic drawing..."<<endl;
    }
};

class Circle : public Shape{
    public:
    void draw(){
        cout<<"Circle is drawing..."<<endl;
    }
    
}; 

class Rectangle  : public Shape{
    public:
    void draw(){
        cout<<"Rectangle is drawing..."<<endl;
    }
    
}; 
class Triangle : public Shape{
    public:
    void draw(){
        cout<<"Triangle is drawing..."<<endl;
    }
    
}; 

void shapeDrawing(Shape *s){
    s->draw(); //this draw is polymorphic
}
int main(){
    //wihtout virtual keyword
    Shape *s= new Shape();
    s->draw();
    //UPCASTING
    Shape *s2 = new Circle();
    s2->draw();
    Circle*c = new Circle();
    c->draw();
    //DOWNCASTING
    // Circle *c2 = new Shape(); //this method wont work
    Shape *s3 = new Shape();
    Circle *c2= (Circle *)s3;
    c2->draw();
    return 0;
} 