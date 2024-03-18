public class MethodOverloading {
    //method  with same name and data type with two arguments
    public int add(int a, int b){
        return a+b;
    }
    //method  with same name and data type with three arguments
    public int add(int a, int b,int c){
        return a+b+c;
    }
    //method  with same name but differnet data type with two arguments
    public double add(double a, double b){
        return a+b;
    }  
}
