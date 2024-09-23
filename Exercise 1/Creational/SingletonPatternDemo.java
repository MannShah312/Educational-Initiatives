class ClassroomManager {
    private static ClassroomManager instance;

    private ClassroomManager() {}

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void createClassroom(String className) {
        System.out.println("Classroom created: " + className);
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        ClassroomManager manager = ClassroomManager.getInstance();
        manager.createClassroom("Math 101");

        ClassroomManager anotherManager = ClassroomManager.getInstance();
        anotherManager.createClassroom("Science 102");

        System.out.println(manager == anotherManager); // Will print true (both point to the same instance)
    }
}