import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        String config="application-config.xml";
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        final Student student = context.getBean("student", Student.class);
        student.getList().forEach(System.out::println);
        System.out.println("**************************");
        System.out.println(student.getMap());
        System.out.println("**************************");
        System.out.println(Arrays.toString(student.getSchools()));
        System.out.println("**************************");
        System.out.println(student.getName());
    }
}
