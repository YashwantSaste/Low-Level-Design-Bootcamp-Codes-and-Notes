public class Main {
    public static void main(String[] args) {
        Car C= new Car("Maruti 800","TXI",4,4,"manual");
        C.startAC();
        C.startEngine();
        C.stopEngine();

        Motorcycle M = new Motorcycle("Splendor","Neon",2,"U","soft");
        M.startEngine();
        M.wheelie();
        M.stopEngine();
    }
}
