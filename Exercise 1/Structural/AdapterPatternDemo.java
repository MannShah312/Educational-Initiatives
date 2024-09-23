class LegacyGradingSystem {
    public int calculateScore(int rawScore) {
        return rawScore * 2;
    }
}

interface GradingSystem {
    int calculateScore(int rawScore);
}

class GradingSystemAdapter implements GradingSystem {
    private LegacyGradingSystem legacyGradingSystem;

    public GradingSystemAdapter(LegacyGradingSystem legacyGradingSystem) {
        this.legacyGradingSystem = legacyGradingSystem;
    }

    @Override
    public int calculateScore(int rawScore) {
        return legacyGradingSystem.calculateScore(rawScore);
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacyGradingSystem legacySystem = new LegacyGradingSystem();
        GradingSystem adapter = new GradingSystemAdapter(legacySystem);

        int score = adapter.calculateScore(50);
        System.out.println("Final Score: " + score);  // Should print 100 (50 * 2)
    }
}