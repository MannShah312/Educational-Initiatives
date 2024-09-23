import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassroomManager manager = new ClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            String[] input = command.split(" ");

            switch (input[0]) {
                case "add_classroom":
                    if (input.length == 2) {
                        manager.addClassroom(input[1]);
                    } else {
                        System.out.println("Usage: add_classroom [class_name]");
                    }
                    break;
                case "add_student":
                    if (input.length == 3) {
                        manager.addStudent(input[1], input[2]);
                    } else {
                        System.out.println("Usage: add_student [student_id] [class_name]");
                    }
                    break;
                case "schedule_assignment":
                    if (input.length == 3) {
                        manager.scheduleAssignment(input[1], input[2]);
                    } else {
                        System.out.println("Usage: schedule_assignment [class_name] [assignment_name]");
                    }
                    break;
                case "submit_assignment":
                    if (input.length == 4) {
                        manager.submitAssignment(input[1], input[2], input[3]);
                    } else {
                        System.out.println("Usage: submit_assignment [student_id] [class_name] [assignment_name]");
                    }
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }
}
