package rest2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    class Response {
        public String result;
        public int value;
    }

    @GetMapping("/square/{value}")
    public Response getSquare(@PathVariable("value") int value) {
        Response q = new Response();
        q.result = "OK";
        q.value = value * value;
        return q;
    }

    @GetMapping("/tasks")
    public List<Task> taskList() {
        return TaskRepository.tasks;
    }

    @GetMapping("/add-task")
    public String addTask(@RequestParam String task) {
        TaskRepository.tasks.add(new Task(task, TaskRepository.tasks.size() + 1));
        return "OK, added " + task;
    }

    // http://localhost:8080/delete-task/4
    @GetMapping(value = "/delete-task/{id}")
    public String deleteTask(@PathVariable("id") int id) {
        TaskRepository.tasks.removeIf(task -> task.id == id);
//        TaskRepository.tasks.remove();
        return "OK";
    }

    @GetMapping("/completed-task/{id}")
    public String completedTask(@PathVariable("id") int id) {
        for (Task t : TaskRepository.tasks) {
            if (t.id == id) {
               t.completed = true;
            }
        }
        return "OK";
    }
    @GetMapping("/uncompleted-task/{id}")
    public String uncompletedTask(@PathVariable("id") int id) {
        for (Task t : TaskRepository.tasks) {
            if (t.id == id) {
                t.completed = false;
            }
        }
        return "OK";
    }
}