package twodimensionalarray;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {

//        int [] [] numbers= new int [3] [4];
//       
//        Random random =new Random();
//        
//        for (int row =0; row<numbers.length; row++){
//
//            for(int column=0; column<numbers[0].length; column++){
//
//                int randomNumber=random.nextInt(20);
//           
//                numbers[row] [column]=randomNumber;
//            }
//        
//        }
//        System.out.println(Arrays.deepToString(numbers));
//Method: 2
//Sum An Arrays rows and columns data
//        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int sum=doSumOfArrays(numbers);
//        System.out.println("Sum of the Arrays is: "+ sum);
//        
//    }
//
//    public static int doSumOfArrays(int[][] myArrays) {
//        int sum = 0;
//
//        for (int row = 0; row < myArrays.length; row++) {
//
//            for (int col = 0; col < myArrays[0].length; col++) {
//
//                sum += myArrays[row][col];
//
//            }
//        }
//        return sum;
//    }
        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = doSum(num);
        System.out.println("Sum of this array is :" + sum);

    }

    public static int doSum(int[][] myArrays) {
        int sum = 0;
        for (int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays[0].length; j++) {

                sum += myArrays[i][j];
            }

        }
        return sum;

    }

}
