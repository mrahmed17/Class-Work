package createanarraywith100rndnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CreateAnArrayWith100RndNum {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList < > ();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {

            myList.add(random.nextInt(101));

        }
        System.out.println("List is : " + myList);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any index num: ");
        try {
            int index = input.nextInt();
            System.out.println(myList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
