package testthreads;
// The task for printing a character a specified number of times

public class PrintChar implements Runnable {

    private char charToPrint; // The character to print
    private int times; // The number of times to repeat

    /**
     * Construct a task with a specified character and number of times to print
     * the character    /**
     * Override the run() method to tell the system what task to perform
     * @param charToPrint
     * @param times
     */
    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    /**
     * Override the run() method to tell the system what task to perform
     */
    
    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}

// The task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable {

    private int lastNum;

    /**
     * Construct a task for printing 1, 2, ..., n
     */
    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
    /**
     * Tell the thread how to run
     */
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }

    }

}

