package checkprimenumber;

public class CheckPrimeNumber {

    int number = 3;

    public CheckPrimeNumber() {

    }

    public CheckPrimeNumber(int newNumber) {
        number = newNumber;
    }

    public String getPrimeNumber() {
        int count = 0;

        for (int i = 0; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            return "It is a prime number";
        } else {
            return "It is not a prime number";
        }

    }

}
