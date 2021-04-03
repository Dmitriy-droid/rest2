package rest2;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> tasks = new ArrayList<>();
    public static void init() {
        tasks.add(new Task( "Learn Java", 1));
        tasks.add(new Task("Learn SQL", 2));
        tasks.add(new Task("Get a job", 3));
    }
}
