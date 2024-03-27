//this is a simpleFactory factory design method we are just memicing to study the concepts


public class ScorpioFactory {
    public Scorpio createScorpio(char type){
        switch (type) {
            case 'N':
                return new ScorpioN();
            case 'C':
                return new ScorpioClassic();
            default:
                return new Scorpio();
        }

        
    }
}
