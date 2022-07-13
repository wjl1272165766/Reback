package test.pojo;

public class School {
    String name;
    String user;

    public School() {
    }

    public School(String name, String user) {
        this.name = name;
        this.user = user;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
