
package exampleofmultithread;

public class ExampleOfMultithread {

    public static void main(String[] args) {
       int n = 2;
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new Runable());
            thread.start();
        }
        
    }
    
}
