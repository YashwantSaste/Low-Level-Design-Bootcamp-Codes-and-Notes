public class AircraftOne {
    private static  AircraftOne aircraftInstacne;
    private AircraftOne(){

    }
    public static AircraftOne getInstance(){
        if(aircraftInstacne == null){
            aircraftInstacne = new AircraftOne();
        }
        return  aircraftInstacne;
    }
}
