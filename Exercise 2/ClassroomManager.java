import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassroomManager {
    private Map<String, Classroom> classrooms = new HashMap<>();

    // Add a new classroom
    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            System.out.println("Classroom \"" + className + "\" has been created.");
        } else {
            System.out.println("Classroom \"" + className + "\" already exists.");
        }
    }

    // Enroll a student into a classroom
    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(new Student(studentId));
            System.out.println("Student \"" + studentId + "\" has been enrolled in \"" + className + "\".");
        } else {
            System.out.println("Classroom \"" + className + "\" does not exist.");
        }
    }

    // Schedule an assignment for a class
    public void scheduleAssignment(String className, String assignmentName) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addAssignment(new Assignment(assignmentName));
            System.out.println("Assignment for \"" + className + "\" has been scheduled.");
        } else {
            System.out.println("Classroom \"" + className + "\" does not exist.");
        }
    }

    // Submit an assignment for a student in a class
    public void submitAssignment(String studentId, String className, String assignmentName) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Student student = classroom.getStudent(studentId);
            if (student != null) {
                classroom.submitAssignment(student, assignmentName);
            } else {
                System.out.println("Student \"" + studentId + "\" is not enrolled in \"" + className + "\".");
            }
        } else {
            System.out.println("Classroom \"" + className + "\" does not exist.");
        }
    }
}
