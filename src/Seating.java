import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Seating {
    private ArrayList<Student> students;
    public Seating() throws FileNotFoundException {
        for(Scanner s = new Scanner(new File("students.txt"));s.hasNextLine();){
            String
            students.add(s.nextLine());
        }

    }
}