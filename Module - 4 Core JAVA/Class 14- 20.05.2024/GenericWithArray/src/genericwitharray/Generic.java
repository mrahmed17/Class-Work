package genericwitharray;

public class Generic<T> {

    private T[] array;

    public Generic(int size) {
        // Creating a generic array using reflection
        array = (T[]) new Object[size];
    }

    public void setElement(int index, T value) {
        array[index] = value;
    }

    public T getElement(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Generic<String> stringArray = new Generic<>(5);
        stringArray.setElement(0, "Rezvi");
        stringArray.setElement(1, "Sanaullah");
        stringArray.setElement(2, "Kutub");
        stringArray.setElement(3, "Robiul");
        stringArray.setElement(4, "Towhid");
        System.out.println("Element at index : " + stringArray.getElement(1));
    }

}

// public static <T> void printArray(T[] array) {
//        for (T element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//}
