package calculate;

public class FindMaxMin {
    public int num1;
    public int num2;
    public int num3;

    public FindMaxMin() {
    }

    public FindMaxMin(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int findMaxNumber() {
        if (num1 > num2 && num1 > num3) {

            return num1;

        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }

    public int findMinNumber() {
        if (num1 < num2 && num1 < num3) {

            return num1;

        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }

    }

}
