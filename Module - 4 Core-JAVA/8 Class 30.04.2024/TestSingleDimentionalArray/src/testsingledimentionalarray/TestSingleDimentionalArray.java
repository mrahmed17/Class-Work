package testsingledimentionalarray;

import java.util.Arrays;
import java.util.Random;

public class TestSingleDimentionalArray {

    public static void main(String[] args) {

        int[] myList = new int[100];

//        String[] names=new String[15];
//        boolean[] status=new boolean[15];
        for (int i = 0; i < myList.length; i++) {
            Random r = new Random();
            int num = r.nextInt(100) + 1;
            myList[i] = num;

        }
        int min = 999999999;
        int max = 0;
        int min1 = 0;
        int max1 = myList[0];
        int sum = 0;
        int avg = 0;
        int count = 0;
        int[] newList = new int[myList.length];

        for (int val : myList) {
            sum += val;
        }

        avg = sum / myList.length;

        int index = 0;
        for (int val : myList) {

            if (val > avg) {
                count += 1;
                newList[index] = val;
                index++;
            }
        }

        for (int val : myList) {
            if (max < val) {      // 0<5
                max = val;      // max=5
            }

            if (min > val) {  //99 >5 
                min = val;
            }
        }

        for (int j = 0; j < myList.length; j++) { //99

            if (max1 < myList[j]) {
                max1 = myList[j];
            }

            System.out.println(j);
        }

        System.out.println(Arrays.toString(myList));
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(count);
        System.out.println(Arrays.toString(newList));
        System.out.println("max number is " + max);
        System.out.println("Min number is " + min);
        System.out.println("Max1 number is " + max1);

    }

}