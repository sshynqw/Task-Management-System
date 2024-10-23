package endTermProject;

public class FeatureTask extends Task {
    public FeatureTask(String title, String description) {
        super(title, description);
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Feature Task: " + title);
    }
}

