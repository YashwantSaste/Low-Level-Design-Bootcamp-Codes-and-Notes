import Models.Fortuner;
import Models.ICar;
public class FortunerBuilder implements ICarBuilder {
    
    Fortuner s1;
    @Override
    public void buildEngine(){
        System.out.println("Fortuner Engine is being inserted");
    }
    @Override
    public void buildTyres(){
        System.out.println("Fortuner builds is being inserted");
    }
    @Override
    public void buildChassis(){
        System.out.println("Fortuner Chassis is being inserted");
    }
    @Override
    public void buildBodyShell(){
        System.out.println("Fortuner Body Shell is being inserted");
    }
    @Override
    public ICar build(){
        return s1;
    }
}
