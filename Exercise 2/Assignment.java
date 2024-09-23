import java.util.ArrayList;
import java.util.List;

public class Assignment {
    private String name;
    private List<String> submittedStudents = new ArrayList<>();

    public Assignment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void submit(Student student) {
        if (!submittedStudents.contains(student.getId())) {
            submittedStudents.add(student.getId());
        }
    }
}
