package dao.professer;

public class Professer {
    private String id;
    private String name;
    private String task;

    public Professer(){}

    public Professer(String id, String name, String task) {
        this.id = id;
        this.name = name;
        this.task = task;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getTask() { return task; }

    public void setTask(String task) { this.task = task; }

    @Override
    public String toString() {
        return "Professer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
}

