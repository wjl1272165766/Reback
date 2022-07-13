import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
    String name;
    List<School> list;
    Map<String,School> map;
    School[] schools;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", schools=" + Arrays.toString(schools) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<School> getList() {
        return list;
    }

    public void setList(List<School> list) {
        this.list = list;
    }

    public Map<String, School> getMap() {
        return map;
    }

    public void setMap(Map<String, School> map) {
        this.map = map;
    }

    public School[] getSchools() {
        return schools;
    }

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public Student() {
    }

    public Student(String name, List<School> list, Map<String, School> map, School[] schools) {
        this.name = name;
        this.list = list;
        this.map = map;
        this.schools = schools;
    }
}
