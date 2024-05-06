package math;

import java.math.BigInteger;

public class Factorial {

    int number = 2;

    public Factorial() {
    }

    public Factorial(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= number; i++) {

            factorial = factorial.multiply(new BigInteger(i + ""));

        }

        return factorial;

    }

    public BigInteger getPrime(BigInteger bigInteger) {

        BigInteger prime = new BigInteger("1");

        int count = 0;
        for (int i = 1; i <= count; i++) {
            if (count % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("A Prime Number");
        } else {
            System.out.println("Not A Prime Number");
        }
        return prime;
    }

}
