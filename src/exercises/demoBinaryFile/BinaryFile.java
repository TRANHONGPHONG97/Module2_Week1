package exercises.demoBinaryFile.data;

import exercises.demoBinaryFile.Students;

import java.io.*;

public class BinaryFile {
    public static void main(String[] args) throws IOException {
        Students students = new Students(1, "Phong", 25);
        Students students1 = new Students(2,"Sinh", 21);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("student.csv")));
        objectOutputStream.writeObject(students);
    }
}
