package findoutfactorialvalueof5;

public class FindOutFactorialValueOf5 {

    public static void main(String[] args) {

        int doFactorial = 1;

        for (int i = 1; i <= 5; i++) {
            doFactorial *= i;
        }

        System.out.println("The Factorial result of '5' is " + doFactorial);

    }
}
