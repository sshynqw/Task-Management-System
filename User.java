package endTermProject;

public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void update(Task task) {
        System.out.println(username + " notified about task update: " + task.getTitle());
    }
}

