package endTermProject;

public class TaskFactory {
    public static Task createTask(String taskType, String title, String description) {
        switch(taskType.toLowerCase()) {
            case "bug":
                return new BugTask(title, description);
            case "feature":
                return new FeatureTask(title, description);
            case "improvement":
                return new ImprovementTask(title, description);
            default:
                throw new IllegalArgumentException("Unknown task type: " + taskType);
        }
    }
}

