package studentmangemenrtsystemio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentMangemenrtSystemIO {

    private static final String FILE_NAME = "student.dat";
    private static List<Student> students;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Najul", 20));
        students.add(new Student("Raju", 22));
        students.add(new Student("Nusrat", 19));

        //Write student information to binary file
        writeStudentsToFile(students);

        //Read and display student information from binary file
        List<Student> readStudents = readStudentsFromList();
        for (Student student : readStudents) {
            System.out.println(student);
        }

    }

    private static void writeStudentsToFile(List<Student> students) {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static List<Student> readStudentsFromList() {
        List<Student> students = new ArrayList<>();
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return students;
    }

}
