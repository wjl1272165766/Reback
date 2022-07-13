package Service.Impl;

import Service.StudentService;
import test.pojo.Student;

public class StudentServiceImpl implements StudentService {
    public void fun(Student student) {
        System.out.println(student.toString());
    }
}
