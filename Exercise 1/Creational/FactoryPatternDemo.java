interface Assignment {
    void create();
}

class CodingAssignment implements Assignment {
    @Override
    public void create() {
        System.out.println("Coding Assignment Created");
    }
}

class EssayAssignment implements Assignment {
    @Override
    public void create() {
        System.out.println("Essay Assignment Created");
    }
}

class AssignmentFactory {
    public static Assignment getAssignment(String type) {
        if (type.equalsIgnoreCase("coding")) {
            return new CodingAssignment();
        } else if (type.equalsIgnoreCase("essay")) {
            return new EssayAssignment();
        }
        return null;
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Assignment assignment1 = AssignmentFactory.getAssignment("coding");
        assignment1.create();

        Assignment assignment2 = AssignmentFactory.getAssignment("essay");
        assignment2.create();
    }
}