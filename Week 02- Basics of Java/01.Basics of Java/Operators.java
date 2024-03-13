public class Operators {
    public static void main(String[] args) {
        //Arithmetic opeators
        int num1= 10;
        int num2= 20;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println((double)num2/num1);
        System.out.println(num2%num1);

        //Relational Operators
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);

        //logical operators

        int c =30;
        boolean cond1= false;
        boolean cond2= (num2>c);
        boolean cond3= (num1<c);

        boolean answer1= cond1 && cond2 && cond3;
        System.out.println(answer1);
        boolean answer2= cond1 || cond2 || cond3;
        System.out.println(answer2);
        boolean answer3= !(cond1 && cond2 && cond3);
        System.out.println(answer3);

        //assignment operators
        int age =19;

        age +=10;
        System.out.println(age);
        age -= 5;
        System.out.println(age);
        age *= 4;
        System.out.println(age);
        age /= 8;
        System.out.println(age);


        //Unary operators

        int value = 10;
        //In postincrement --> first use then increment
        System.out.println(value++);
        //In preincrement --> first increment then use
        System.out.println(++value);
        
    }
}
