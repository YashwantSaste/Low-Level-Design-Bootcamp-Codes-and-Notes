public class SingletonLazy {
    private SingletonLazy(){
        System.out.println("Constructor of the singletonlazy class has been declared");
    }
    private static class Holder{
        private  static  final SingletonLazy INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return Holder.INSTANCE;
    }

    public static void main(String[] args){
        //the below code will create the two instances of the singleton class, breaching the singleton design pattern
        System.out.println("Demonstrating the thread problem with singleton design pattern");
        Thread th1 = new Thread(()->{SingletonLazy.getInstance();});
        Thread th2= new Thread(()->{SingletonLazy.getInstance();});
        th1.start();
        th2.start();

//        System.out.println("Creating the object creation using Singleton method");
//        //but in the below case only one instance of the object will be created and that will be returned hereafter
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
    }
}
