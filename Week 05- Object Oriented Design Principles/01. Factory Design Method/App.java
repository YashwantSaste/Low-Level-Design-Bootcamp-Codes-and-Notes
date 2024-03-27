import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // ScorpioN obj1 = new ScorpioN();
        // obj1.driveCar();
        // ScorpioClassic obj2 = new ScorpioClassic();
        // obj2.driveCar();

        // ScorpioFactory factory = new ScorpioFactory();
        // Scorpio car1= factory.createScorpio('N');
        // car1.driveCar();

        Collection<Scorpio> list = new ArrayList<>();
        Scorpio car1= new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        list.add(car1);
        list.add(car2);
        for(Scorpio car:list){
            car.driveCar(); 
        }
    }
}
