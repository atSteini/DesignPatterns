package main.creational.pojo;

public class MyObject {
    private Long id;
    private String name;

    public MyObject(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyObject() {

    }

    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
