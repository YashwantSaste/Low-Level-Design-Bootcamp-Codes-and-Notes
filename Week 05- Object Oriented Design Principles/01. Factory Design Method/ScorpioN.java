import Models.ScorpioNBodyShell;
import Models.ScorpioNEngine;

public class ScorpioN extends Scorpio{
    @Override
    public void makeScorpio(){
        System.out.println("Inside ScorpioN Class");
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
    } 
    public void driveCar(){
        makeScorpio();
        System.out.println("I am driving a ScorpioN");
    }
}