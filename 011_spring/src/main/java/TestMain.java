import Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.pojo.Student;

public class TestMain {
    public static void main(String[] args) {
        String config="application.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentService studentService= (StudentService) ac.getBean("studentService");
        Student student= (Student) ac.getBean("student");
        studentService.fun(student);
    }
}
