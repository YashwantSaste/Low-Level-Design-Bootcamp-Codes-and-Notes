import Models.ICar;

public class App {
    public static void main(String[] args) throws Exception {
        ICarBuilder builder = new ScorpioBuilder();
        DirectorClass director = new DirectorClass(builder);

        //giving the guidance for the creation of the object

        director.construct(true,true,false,true);

        ICar car = builder.build();
    }
}
