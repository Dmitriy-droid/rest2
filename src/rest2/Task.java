package rest2;

public class Task {
    public String text;
    public int id;
    public boolean completed = false;
    public Task(String text, int id) {
        this.text = text;
        this.id = id;
    }
}
