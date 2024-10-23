package endTermProject;

public class BugTask extends Task {
    public BugTask(String title, String description) {
        super(title, description);
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Bug Task: " + title);
    }
}

