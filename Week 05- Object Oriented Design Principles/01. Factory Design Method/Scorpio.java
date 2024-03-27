import Models.IBodyShell;
import Models.IEngine;

public class Scorpio {

    IEngine engine;

    IBodyShell bodyShell;

    public void makeScorpio(){
        System.out.println("Inside Scorpio");
        this.engine= engine;
        this.bodyShell= bodyShell;
    }
    public void driveCar(){
        // Scorpio car = new Scorpio();
        makeScorpio();
        System.out.println("I am inside Scorpio Parent Class");
    }
}
