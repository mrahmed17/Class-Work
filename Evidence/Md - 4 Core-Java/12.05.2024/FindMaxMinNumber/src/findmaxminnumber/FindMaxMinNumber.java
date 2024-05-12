package findmaxminnumber;

import calculate.FindMaxMin;

public class FindMaxMinNumber {

    public static void main(String[] args) {

        FindMaxMin maxMin = new FindMaxMin(50, 80, 60);

        System.out.println("Max number is " + maxMin.findMaxNumber());
        System.out.println("Min number is " + maxMin.findMinNumber());
    }

}
