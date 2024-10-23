package endTermProject;

public class PriorityTaskDecorator extends TaskDecorator {
    private String priority;

    public PriorityTaskDecorator(Task task, String priority) {
        super(task);
        this.priority = priority;
    }

    @Override
    public void executeTask() {
        super.executeTask();
        System.out.println("Priority: " + priority);
    }
}

