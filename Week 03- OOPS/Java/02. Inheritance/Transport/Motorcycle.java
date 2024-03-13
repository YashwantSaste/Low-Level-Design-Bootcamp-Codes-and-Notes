public class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;
    Motorcycle(String name, String model,int noOfTyres,String handlebarStyle, String suspensionType){
        super(name,model,noOfTyres);
        this.handleBarStyle=handlebarStyle;
        this.suspensionType=suspensionType;
    }

    public void wheelie(){
        System.out.println("Motorcycle is doing wheelie");
    }
}
