public class SingletonDCLocking {
    private volatile  static SingletonDCLocking instance;
    private SingletonDCLocking(){
        System.out.println("Creating the object of SingletonDCLocking class");
    }
    synchronized public static SingletonDCLocking getInstance(){
        //creating or instantiating the object when only needed;
        if(instance == null){
            synchronized (SingletonDCLocking.class){
                if(instance ==  null){
                    instance = new SingletonDCLocking();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating the thread problem with singleton design pattern");
        Thread th1 = new Thread(()->{SingletonDCLocking.getInstance();});
        Thread th2= new Thread(()->{SingletonDCLocking.getInstance();});
        th1.start();
        th2.start();
    }
}
