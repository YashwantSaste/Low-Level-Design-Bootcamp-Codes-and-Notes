import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder {
    Scorpio s1;
    @Override
    public void buildEngine(){
        System.out.println("Scorpio Engine is being inserted");
    }
    @Override
    public void buildTyres(){
        System.out.println("Scorpio Tyres is being inserted");
    }
    @Override
    public void buildChassis(){
        System.out.println("Scorpio Chassis is being inserted");
    }
    @Override
    public void buildBodyShell(){
        System.out.println("Scorpio Body Shell is being inserted");
    }
    @Override
    public ICar build(){
        return s1;
    }
    
}