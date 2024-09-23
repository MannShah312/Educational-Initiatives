import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

class Classroom {
    private List<Observer> students = new ArrayList<>();
    private String className;

    public Classroom(String className) {
        this.className = className;
    }

    public void addStudent(Observer student) {
        students.add(student);
    }

    public void addAssignment(String assignment) {
        System.out.println("Assignment added to " + className + ": " + assignment);
        notifyStudents("New assignment: " + assignment);
    }

    private void notifyStudents(String message) {
        for (Observer student : students) {
            student.update(message);
        }
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("Math 101");

        Student Mann = new Student("Mann");
        Student Mansi = new Student("Mansi");

        classroom.addStudent(Mann);
        classroom.addStudent(Mansi);

        classroom.addAssignment("Algebra Homework");
    }
}
