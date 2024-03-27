public class DirectorClass {
    ICarBuilder carBuilder;
    public DirectorClass(ICarBuilder builder){
        this.carBuilder = builder;
    }
    //instrcution --> Director class gives the instruvtion for the creation of the object

    public void construct(boolean tyreNeeded,boolean bodyShellNeeded,boolean chassisNeeded,boolean engineNeeded){
        if(tyreNeeded){
            carBuilder.buildTyres();
        }
        if(engineNeeded){
            carBuilder.buildEngine();
        }
        if(bodyShellNeeded){
            carBuilder.buildBodyShell();
        }
        if(chassisNeeded){
            carBuilder.buildChassis();
        }
    }
}
