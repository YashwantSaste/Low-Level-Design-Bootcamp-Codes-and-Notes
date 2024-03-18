public class App {
    public static void main(String[] args){
        System.out.println("This is polymorphism in Java");
        MethodOverloading Calculator= new MethodOverloading();
        int sum1=Calculator.add(1, 1);
        double sum2=Calculator.add(4.25, 4.25);
        int sum3=Calculator.add(1, 1,5);
        System.out.println("This is the result of first add: "+sum1);
        System.out.println("This is the result of second add: "+sum2);   
        System.out.println("This is the result of third add: "+sum3);

        //runtime polymorphism

        Shapes S = new Shapes();
        S.draw();
        Rectangle R = new Rectangle();
        R.draw();

        doDrawingStuff(new Rectangle());
        doDrawingStuff(new Circle());
    }

    public static void doDrawingStuff(Shapes s){
        s.draw(); //polymorphic
    }
}
