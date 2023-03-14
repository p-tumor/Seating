import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> neighbors;
    public Student(String studentsName){
        name = studentsName;
        neighbors = new ArrayList<>();
    }
    public boolean addNeighbor(String neighbor){
        if(neighbors.size() < 2){
            neighbors.add(neighbor);
            return true;
        }
        return false;
    }
}