import Models.ICar;

public interface ICarBuilder{
    
    public void buildEngine();
    public void buildChassis();
    public void buildTyres();
    public void buildBodyShell();
    //below method returns the final object i.e the car
    public ICar build();
    //to bypass the director creation we can directly insert the instruction functions or the step by step performing function 
    //in the build function itself and then return the object;
}