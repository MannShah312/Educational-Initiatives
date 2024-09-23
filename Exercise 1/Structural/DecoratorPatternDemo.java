interface Assignment {
    String getDescription();
    double getScore();
}

class BasicAssignment implements Assignment {
    @Override
    public String getDescription() {
        return "Basic Assignment";
    }

    @Override
    public double getScore() {
        return 100.0;
    }
}

abstract class AssignmentDecorator implements Assignment {
    protected Assignment decoratedAssignment;

    public AssignmentDecorator(Assignment assignment) {
        this.decoratedAssignment = assignment;
    }

    @Override
    public String getDescription() {
        return decoratedAssignment.getDescription();
    }

    @Override
    public double getScore() {
        return decoratedAssignment.getScore();
    }
}

class ExtraCreditDecorator extends AssignmentDecorator {
    public ExtraCreditDecorator(Assignment assignment) {
        super(assignment);
    }

    @Override
    public double getScore() {
        return super.getScore() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Extra Credit";
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Assignment basicAssignment = new BasicAssignment();
        Assignment decoratedAssignment = new ExtraCreditDecorator(basicAssignment);

        System.out.println("Assignment Description: " + decoratedAssignment.getDescription());
        System.out.println("Final Score: " + decoratedAssignment.getScore());
    }
}