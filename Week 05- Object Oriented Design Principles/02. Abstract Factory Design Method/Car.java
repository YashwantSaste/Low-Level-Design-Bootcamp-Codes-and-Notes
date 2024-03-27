import Models.IEngine;

public class Car {
    IEngine engine;
    IVehicleFactory carFactory;
    Car(IVehicleFactory factory){
        this.carFactory=factory;
    }

    public void driveCar(){
        carFactory.createEngine();
        System.out.println("The car has been manufactured");
    }
}
