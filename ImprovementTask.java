package endTermProject;

public class ImprovementTask extends Task {
    public ImprovementTask(String title, String description) {
        super(title, description);
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Improvement Task: " + title);
    }
}

