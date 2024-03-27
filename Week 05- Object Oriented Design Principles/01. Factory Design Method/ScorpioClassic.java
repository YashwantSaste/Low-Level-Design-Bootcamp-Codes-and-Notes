import Models.ScorpioClassicBodyshell;
import Models.ScorpioClassicEngine;

public class ScorpioClassic extends Scorpio{

    @Override
    public void makeScorpio(){
        System.out.println("Inside ScorpioClassic CLass");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScorpioClassicBodyshell();
    }
    public void driveCar(){
        makeScorpio();
        System.out.println("I am driving a Scorpio Classic");
    }
}
