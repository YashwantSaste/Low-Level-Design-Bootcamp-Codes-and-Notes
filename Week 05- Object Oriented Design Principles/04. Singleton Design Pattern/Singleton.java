//Demonstration of multi threading can disrupt the singleton design pattern
public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Inside the constrcutor to create an instance");
    }
    private static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args){
        //the below code will create the two instances of the singleton class, breaching the singleton design pattern
        System.out.println("Demonstrating the thread problem with singleton design pattern");
        Thread th1 = new Thread(()->{Singleton.getInstance();});
        Thread th2= new Thread(()->{Singleton.getInstance();});
        th1.start();
        th2.start();

//        System.out.println("Creating the object creation using Singleton method");
//        //but in the below case only one instance of the object will be created and that will be returned hereafter
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
    }
}
