import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private String name;
    private Map<String, Student> students = new HashMap<>();
    private List<Assignment> assignments = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (!students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        }
    }

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void submitAssignment(Student student, String assignmentName) {
        for (Assignment assignment : assignments) {
            if (assignment.getName().equals(assignmentName)) {
                assignment.submit(student);
                System.out.println("Assignment \"" + assignmentName + "\" submitted by Student \"" + student.getId() + "\" in \"" + this.name + "\".");
                return;
            }
        }
        System.out.println("Assignment \"" + assignmentName + "\" does not exist in \"" + this.name + "\".");
    }
}
