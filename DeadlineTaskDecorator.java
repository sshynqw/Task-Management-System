package endTermProject;

public class DeadlineTaskDecorator extends TaskDecorator {
    private String deadline;

    public DeadlineTaskDecorator(Task task, String deadline) {
        super(task);
        this.deadline = deadline;
    }

    @Override
    public void executeTask() {
        super.executeTask();
        System.out.println("Deadline: " + deadline);
    }
}

