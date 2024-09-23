interface GradingStrategy {
    double calculateGrade(int score);
}

class StandardGrading implements GradingStrategy {
    @Override
    public double calculateGrade(int score) {
        return score;
    }
}

class ExtraCreditGrading implements GradingStrategy {
    @Override
    public double calculateGrade(int score) {
        return score + 5;
    }
}

class Assignment {
    private GradingStrategy gradingStrategy;
    private String name;

    public Assignment(String name, GradingStrategy strategy) {
        this.name = name;
        this.gradingStrategy = strategy;
    }

    public void gradeAssignment(int score) {
        System.out.println("Grading " + name + ": Final Grade = " + gradingStrategy.calculateGrade(score));
    }
}

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Assignment assignment1 = new Assignment("Math Test", new StandardGrading());
        Assignment assignment2 = new Assignment("Extra Credit Quiz", new ExtraCreditGrading());

        assignment1.gradeAssignment(85);
        assignment2.gradeAssignment(85);
    
    }
}